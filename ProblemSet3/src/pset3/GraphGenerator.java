package pset3;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InvokeInstruction;
import org.apache.bcel.generic.MethodGen;

public class GraphGenerator {
	public CFG createCFG(String className) throws ClassNotFoundException {
		CFG cfg = new CFG();
		JavaClass jc = Repository.lookupClass(className);
		ClassGen cg = new ClassGen(jc);
		ConstantPoolGen cpg = cg.getConstantPool();
		for (Method m: cg.getMethods()) {
			cfg.addNode(-1, m, jc);
			MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
			InstructionList il = mg.getInstructionList();
			InstructionHandle[] handles = il.getInstructionHandles();
			for (int i=0; i<handles.length; i++) {
				InstructionHandle ih = handles[i];
				int position = ih.getPosition();
				cfg.addNode(position, m, jc);
				Instruction inst = ih.getInstruction();
				// your code goes here
				if(inst.getName().contains("load")){
					cfg.addEdge(position, m, jc, handles[i+1].getPosition(), m, jc);
				}else if(inst.getName().contains("invokespecial")){
					cfg.addEdge(position, m, jc, handles[i+1].getPosition(), m, jc);
				}else if(inst.getName().contains("return")){
					cfg.addEdge(position, m, jc, -1, m, jc);
				}else if(inst.getName().contains("if")){
					cfg.addEdge(position, m, jc, ((BranchInstruction)inst).getTarget().getPosition(), m, jc);
					cfg.addEdge(position, m, jc, handles[i+1].getPosition(), m, jc);
				}
			}
		}
		//cfg.print();
		return cfg;
	}
	@SuppressWarnings("deprecation")
	public CFG createCFGWithMethodInvocation(String className) throws ClassNotFoundException {
		CFG cfg = new CFG();
		JavaClass jc = Repository.lookupClass(className);
		ClassGen cg = new ClassGen(jc);
		ConstantPoolGen cpg = cg.getConstantPool();
		for (Method m: cg.getMethods()) {
			cfg.addNode(-1, m, jc);
			MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
			InstructionList il = mg.getInstructionList();
			InstructionHandle[] handles = il.getInstructionHandles();
			for (int i=0; i<handles.length; i++) {
				InstructionHandle ih = handles[i];
				int position = ih.getPosition();
				cfg.addNode(position, m, jc);
				Instruction inst = ih.getInstruction();
				// your code goes here
				if(inst.getName().contains("load")){
					cfg.addEdge(position, m, jc, handles[i+1].getPosition(), m, jc);
				}else if(inst.getName().contains("invokespecial")){
					cfg.addEdge(position, m, jc, handles[i+1].getPosition(), m, jc);
				}else if(inst.getName().contains("return")){
					cfg.addEdge(position, m, jc, -1, m, jc);
				}else if(inst.getName().contains("if")){
					cfg.addEdge(position, m, jc, ((BranchInstruction)inst).getTarget().getPosition(), m, jc);
					cfg.addEdge(position, m, jc, handles[i+1].getPosition(), m, jc);
				}else if(inst.getName().contains("invokestatic")){
					InvokeInstruction invokeInst = ((InvokeInstruction)inst);
					Method invokeMeth = cg.containsMethod(invokeInst.getName(cpg), invokeInst.getSignature(cpg));
					JavaClass invokeClass = Repository.lookupClass(invokeInst.getClassName(cpg));
					cfg.addEdge(position, m, jc, 0, invokeMeth,invokeClass );
					cfg.addEdge(-1, invokeMeth, invokeClass, handles[i+1].getPosition(), m,  jc);
				}
			}
		}
		//cfg.print();
		return cfg;
	}
	public static void main(String[] a) throws ClassNotFoundException {
		GraphGenerator gg = new GraphGenerator();
		CFG c = gg.createCFG("pset3.C"); // example invocation of createCFG
		CFG d = gg.createCFGWithMethodInvocation("pset3.D"); // example invocation of createCFGWithMethodInovcation
		System.out.println(d.isReachable("main", "pset3.D", "foo", "pset3.D"));
		System.out.println(d.isReachable("main", "pset3.D", "bar", "pset3.D"));
		System.out.println(d.isReachable("foo", "pset3.D", "main", "pset3.D"));
	}

}

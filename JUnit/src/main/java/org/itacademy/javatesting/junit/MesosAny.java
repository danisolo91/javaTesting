package org.itacademy.javatesting.junit;

import java.util.TreeMap;

public class MesosAny {
	
	private TreeMap<Integer, String> mesos;
	
	public MesosAny() {
		mesos = new TreeMap<>();
		mesos.put(1, "Gener");
		mesos.put(2, "Febrer");
		mesos.put(3, "Març");
		mesos.put(4, "Abril");
		mesos.put(5, "Maig");
		mesos.put(6, "Juny");
		mesos.put(7, "Juliol");
		mesos.put(8, "Agost");
		mesos.put(9, "Setembre");
		mesos.put(10, "Octubre");
		mesos.put(11, "Novembre");
		mesos.put(12, "Desembre");
	}

	public TreeMap<Integer, String> getMesos() {
		return mesos;
	}

	public void setMesos(TreeMap<Integer, String> mesos) {
		this.mesos = mesos;
	}

	@Override
	public String toString() {
		return "MesosAny [mesos=" + mesos + "]";
	}

}

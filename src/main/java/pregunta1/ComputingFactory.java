package pregunta1;



public abstract class ComputingFactory {
	public static final String MEMORY = "Memory";
	public static final String FINISH = "Finish";
	public static final String PROCESSOR = "Proceesor";
	public static final String STORAGE = "Storage";
	
	public static ComputingFactory getComputingFactory(String type) {
		return null;
	   /* if (type.equals(HostingPlanAbstractFactory.WINDOWS)) {
	        return new WindowsHostingPlanFactory();
	    }
	    if (type.equals(HostingPlanAbstractFactory.LINUX)) {
	        return new LinuxHostingPlanFactory();
	    }
	    return new LinuxHostingPlanFactory();*/
	}
	
	public abstract MemoryFactory createMemoryFactory();

	public abstract FinishFactory createFinishFactory();
	
	public abstract ProcessorFactory createProcessorFactory();
	
	public abstract StorageFactory createStorageFactory();

	
}







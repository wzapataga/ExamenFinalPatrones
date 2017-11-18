package pregunta1;

public class ProcessorFactory  extends ComputingFactory{

    @Override
	public MemoryFactory createMemoryFactory()
	{
		return new MemoryFactory();
	}
	
	
    @Override
	public  FinishFactory createFinishFactory()
	{
		return null; 
	}
    @Override
	public  ProcessorFactory createProcessorFactory()
	{
		return null; 
	}
    @Override
	public  StorageFactory createStorageFactory()
	{
		return null; 
	}
}

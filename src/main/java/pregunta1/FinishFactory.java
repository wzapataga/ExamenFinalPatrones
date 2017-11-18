package pregunta1;

public class FinishFactory extends ComputingFactory {

    @Override
	public MemoryFactory createMemoryFactory()
	{
	return null;
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

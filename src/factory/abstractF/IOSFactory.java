package factory.abstractF;

public class IOSFactory implements SystemFactory{
    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new IOSUIController();
    }
}

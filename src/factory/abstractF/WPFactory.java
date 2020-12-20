package factory.abstractF;

public class WPFactory implements SystemFactory{
    @Override
    public OperationController createOperationController() {
        return new WPOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new WPUIController();
    }
}

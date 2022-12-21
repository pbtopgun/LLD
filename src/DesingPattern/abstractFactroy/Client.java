package DesingPattern.abstractFactroy;

import DesingPattern.abstractFactroy.Lib.Lib;
import DesingPattern.abstractFactroy.Lib.UiFactory;
import DesingPattern.abstractFactroy.products.Button.Button;

public class Client {
    public static void main(String[] args) throws Exception {
        Lib lib = new Lib();
        //Window
        UiFactory factory = lib.getUiFactory("Window");

        Button winButton = factory.createButton();
        winButton.click();
        winButton.setColor();

        //IOS
        UiFactory iosfactory = lib.getUiFactory("IOS");
        Button iosButton = iosfactory.createButton();
        iosButton.click();

    }
}

package DesingPattern.abstractFactroy.Lib;

import DesingPattern.abstractFactroy.products.Button.Button;
import DesingPattern.abstractFactroy.products.Button.IOSButton;
import DesingPattern.abstractFactroy.products.Panel.IOSPanel;
import DesingPattern.abstractFactroy.products.Panel.Panel;
import DesingPattern.abstractFactroy.products.TextBox.IOSTextBox;
import DesingPattern.abstractFactroy.products.TextBox.Textbox;

public class IOSFactory implements UiFactory{

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new IOSButton();
    }

    @Override
    public Textbox createTextBox() {
        // TODO Auto-generated method stub
        return new IOSTextBox();
    }

    @Override
    public Panel createPanel() {
        // TODO Auto-generated method stub
        return new IOSPanel();
    }
    
}

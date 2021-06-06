package setting;

import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

public class SettingsComponent {
    public JPanel mainPanel;
    public JBTextField blocName;
    public JBTextField cubitName;
    public JBTextField eventName;
    public JBTextField viewName;
    public JBTextField viewFileName;

    public SettingsComponent() {
        blocName = new JBTextField();
        cubitName = new JBTextField();
        eventName = new JBTextField();
        viewName = new JBTextField();
        viewFileName = new JBTextField();

        mainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(new JBLabel("Bloc Name: "), blocName)
                .addLabeledComponent(new JBLabel("Cubit Name: "), cubitName)
                .addLabeledComponent(new JBLabel("Event Name: "), eventName)
                .addLabeledComponent(new JBLabel("View Name: "), viewName)
                .addLabeledComponent(new JBLabel("View File Name: "), viewFileName)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }
}

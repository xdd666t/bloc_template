package setting;

import com.intellij.openapi.options.Configurable;
import helper.BlocTaoData;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SettingsConfigurable implements Configurable {

    private final BlocTaoData data = BlocTaoData.getInstance();
    private SettingsComponent mSetting;

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Flutter Bloc Setting";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        mSetting = new SettingsComponent();
        return mSetting.mainPanel;
    }

    @Override
    public boolean isModified() {
        boolean modified;
        modified = !mSetting.blocName.getText().equals(data.blocName)
                || !mSetting.cubitName.getText().equals(data.cubitName)
                || !mSetting.eventName.getText().equals(data.eventName)
                || !mSetting.viewName.getText().equals(data.viewName)
                || !mSetting.viewFileName.getText().equals(data.viewFileName);
        return modified;
    }

    @Override
    public void apply() {
        data.blocName = mSetting.blocName.getText();
        data.cubitName = mSetting.cubitName.getText();
        data.eventName = mSetting.eventName.getText();
        data.viewName = mSetting.viewName.getText();
        data.viewFileName = mSetting.viewFileName.getText();
    }

    @Override
    public void reset() {
        mSetting.blocName.setText(data.blocName);
        mSetting.cubitName.setText(data.cubitName);
        mSetting.eventName.setText(data.eventName);
        mSetting.viewName.setText(data.viewName);
        mSetting.viewFileName.setText(data.viewFileName);
    }

    @Override
    public void disposeUIResources() {
        mSetting = null;
    }
}

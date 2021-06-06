package helper;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;

//如果包名和类名和其他插件相同，会引起IDEA奔溃的坑比问题
//故此处类名起的稍微与众不同点
//custom save location
@com.intellij.openapi.components.State(
        name = "BlocTaoData",
        storages = {@Storage(value = "BlocTaoData.xml")
        })
public class BlocTaoData implements PersistentStateComponent<BlocTaoData> {
    // 0:default  1:high   2:extended
    public int defaultMode = BlocConfig.defaultMode;

    //default true
    public boolean useFolder = BlocConfig.useFolder;

    //default false
    public boolean usePrefix = BlocConfig.usePrefix;


    //Logical layer name
    public String blocName = BlocConfig.blocName;
    public String cubitName = BlocConfig.cubitName;

    //view layer name
    public String viewName = BlocConfig.viewName;
    public String viewFileName = BlocConfig.viewFileName;

    //state layer name
    public String stateName = BlocConfig.stateName;

    public static BlocTaoData getInstance() {
        return ServiceManager.getService(BlocTaoData.class);
    }

    @Override
    public BlocTaoData getState() {
        return this;
    }

    @Override
    public void loadState(BlocTaoData state) {
        XmlSerializerUtil.copyBean(state, this);
    }
}


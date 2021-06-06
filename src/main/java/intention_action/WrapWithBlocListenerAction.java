package intention_action;

import org.jetbrains.annotations.NotNull;

public class WrapWithBlocListenerAction extends WrapWithAction {
    public WrapWithBlocListenerAction() {
        super(SnippetType.BlocListener);
    }

    @NotNull
    public String getText() {
        return "Wrap with BlocListener";
    }
}

package intention_action;

import org.jetbrains.annotations.NotNull;

public class WrapWithBlocProviderAction extends WrapWithAction {
    public WrapWithBlocProviderAction() {
        super(SnippetType.BlocProvider);
    }

    @NotNull
    public String getText() {
        return "Wrap with BlocProvider";
    }
}

package intention_action;

import org.jetbrains.annotations.NotNull;

public class WrapWithBlocConsumerAction extends WrapWithAction {
    public WrapWithBlocConsumerAction() {
        super(SnippetType.BlocConsumer);
    }

    @NotNull
    public String getText() {
        return "Wrap with BlocConsumer";
    }
}

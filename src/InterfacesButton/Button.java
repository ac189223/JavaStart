package InterfacesButton;

public class Button {

    private OnClickListener listener;

    public void click() {
        if (listener != null) {
            listener.onClick();                 // Someone pushed the button
        }
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}


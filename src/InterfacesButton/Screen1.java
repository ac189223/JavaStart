package InterfacesButton;


public class Screen1 {

    private final Button button;                    // Create button

    // Constructor for screen creation
    public Screen1() {

        // Button creation
        button = new Button();
        // Waiting for the push - listening phase - ver1, working same but longer
//        button.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Someone pushed the button!");
//            }
//        });
        // Waiting for the push - listening phase - ver2, shorter
        button.setOnClickListener(() -> System.out.println("Someone pushed the button!"));
    }

    // Method below is returning button
    public Button getButton() {
        return button;
    }
}


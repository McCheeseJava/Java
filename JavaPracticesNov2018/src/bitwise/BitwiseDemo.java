package bitwise;
public class BitwiseDemo {

    static final int VISIBLE = 1;
    static final int DRAGGABLE = 2;
    static final int SELECTABLE = 4;
    static final int EDITABLE = 8;

    public static void main(String[] args)
    {
        int flags = 0;

        flags = flags | VISIBLE;

	System.out.println(flags);

        flags = flags | DRAGGABLE;

	System.out.println(flags);

        if ((flags & VISIBLE) == VISIBLE) {
            if ((flags & DRAGGABLE) == DRAGGABLE) {
                 System.out.println("Flags are Visible and Draggable.");
            }
        }

        flags = flags | EDITABLE;

        if ((flags & EDITABLE) == EDITABLE) {
	    System.out.println("Flags are now also Editable.");
        }
    }
}


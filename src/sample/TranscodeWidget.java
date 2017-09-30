package sample;

//////////////////////////////////////////////////
/// NAME: LAWRENCE CHEN                        ///
/// ASSIGNMENT: HW3, RANGE, CONTAINER, WINDOWS ///
//              AND DIALOG                     ///
/// PROFESSOR: DAVID BOLDING                   ///
/// DUE DATE: OCTOBER 5th before class         ///
//////////////////////////////////////////////////

/*
    Outline // Students will create a simple GUI for a transcoding system.

    Transcoding Widget should include the following components :

        -  On one line, a read-only text-field and a button that says “Get Source”; we will call these the “source
            text-field” and “source button”, respectively.

        -  On another line, a read-only text-field and a button that says “Get Target” (the “target textfield” and
            “target button”)

        -  On another line, a slider, with a range from 1 to 9 (the “quality slider”).

        -  On another line, a single button that says “Start”.

        -  On the last line, a progress bar and a button that says “Step”.

        -  Each row should take up the full width of the widget

        -  Any excess height allocated to the widget should be left blank beneath the last row

        -  The buttons should remain at their natural size, and the other components (the text-fields, sliders and
           progress-bars) should grow horizontally to take up the extra space

        -  (JavaFX reminder: you can get the progress bar to grow horizontally by setting its preferred size to some
           arbitrarily large number

        -  Any extra vertical space should be left unused at the bottom of the widget

        -  When the program starts, the source and target text-fields should be blank

        -   If the user clicks the source button, an open-file dialog should be displayed; if the user picks a file,
            then that file’s path should be displayed in the source text-field (if they does not select a file,
            the contents of the source text-filed should not be altered)

            -   Likewise, when the user clicks target button, a save filedialog should be displayed, and the path
                selected should be displayed in the target text-field (if the user selected a file).

        // WHEN THE USER CLICKS THE START BUTTON

         if valid settings haven’t been stored, display an error (with an error dialog);

         if the progress-bar is at less than 100%,
            advance it by 10%;

         if the progress-bar is at 100%,
            set it to indeterminate mode and display a message to the user that their encoding is
            complete (using a message dialog);

         if the progress-bar is in indeterminate mode,
            do nothing.

         The Main Interface In your main window, you should have a single button in the
         bottom-right corner that says “Add Transcode”, and a tab-manager that takes up all of the remaining space.

         When the “Add Transcode” button is clicked, you should add a new tab to the tab-manager; this tab should
         contain a single scroller, and that scroller should contain a single TranscodeWidget. (You can set the title
         of the tab to anything you’d like.)

 */

public class TranscodeWidget {


}

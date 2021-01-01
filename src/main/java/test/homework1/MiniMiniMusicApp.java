package homework1;

import GUI.MyDrawPanel;

import javax.sound.midi.*;
import javax.swing.*;

public class MiniMiniMusicApp implements ControllerEventListener{
    static JFrame f = new JFrame("Первый клип");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
        //System.exit(0);
    }

    public void setUpGui() {
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
    }

    public void play() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            sequencer.addControllerEventListener(ml, new int[] {127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;

            for (int i = 5; i < 61; i+= 4) {
                r = (int) ((Math.random() * 50) + 1);

                track.add(makeEvent(176, 1,127, 0, i));
                track.add(makeEvent(144,1,r,100,i));

                track.add(makeEvent(128,1,r,100,i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(120);
            sequencer.start();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void controlChange(ShortMessage event) {
        System.out.println("Ля");
    }

    public static MidiEvent makeEvent (int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;

        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent (a, tick) ;
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
        return event;
    }
}

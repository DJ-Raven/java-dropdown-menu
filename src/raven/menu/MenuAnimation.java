package raven.menu;

import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MenuAnimation {

    public static void showMenu(Component component, MenuItem item, MigLayout layout, boolean show) {
        int height = component.getPreferredSize().height;
        Animator animator = new Animator(300, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                layout.setComponentConstraints(component, "h " + height * f + "!");
                item.setAnimate(f);
                component.revalidate();
                item.repaint();
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.start();
    }
}

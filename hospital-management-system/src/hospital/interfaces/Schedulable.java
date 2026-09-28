package hospital.interfaces;

import java.util.List;

public interface Schedulable {
    List<String> getAvailableSlots();
    boolean bookSlot(String slot);
    void cancelSlot(String slot);
}

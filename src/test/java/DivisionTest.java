import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testGetDivision_NewDivision() {
        Division division = Division.GetDivision("Division A");
        assertNotNull(division);
        assertEquals("Division A", division.getName());
    }

    @Test
    public void testGetDivision_ExistingDivision() {
        Division division1 = Division.GetDivision("Division B");
        Division division2 = Division.GetDivision("Division B");
        assertNotNull(division1);
        assertNotNull(division2);
        assertEquals(division1, division2);
    }

    @Test
    public void testGetDivision_IdAssignment() {
        Division division1 = Division.GetDivision("Division C");
        Division division2 = Division.GetDivision("Division D");
        assertNotEquals(division1.getId(), division2.getId());
    }
}
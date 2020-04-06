package slider;

import base.baseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SliderTests extends baseTests {

    @Test
    public void testSlider(){
        var horizontalSlider = homePage.clickSlider();
        String value = "3.5";
        horizontalSlider.moveSlider(value);
        assertEquals(horizontalSlider.getMoveSlider(),
                value, "Slider value is correct!");
    }

}

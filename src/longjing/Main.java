/**
 * @author dg
 */
package longjing;

import longjing.content.DrBlocks;
import mindustry.mod.Mod;

public class Main extends Mod {
    @Override
    public void loadContent() {
        DrBlocks.load();
    }

}

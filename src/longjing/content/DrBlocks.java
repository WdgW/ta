package longjing.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.production.BeamDrill;
import mindustry.world.blocks.production.Drill;
import mindustry.world.blocks.production.WallCrafter;
import mindustry.world.draw.DrawPlasma;

public class DrBlocks {
    public static Drill drill;
    public static WallCrafter wallcrafter;
    public static BeamDrill beamDrill;

    public static void load() {
        drill = new Drill("drill") {{
            tier = 10;
            size = 1;
            health = 100;
            itemCapacity = 20;
            alwaysUnlocked = true;
            requirements(Category.production, ItemStack.with(Items.copper, 10));
        }};
        wallcrafter = new WallCrafter("wallcrafter") {{
            size = 1;
            health = 100;
            itemCapacity = 20;
            alwaysUnlocked = true;
            requirements(Category.production, ItemStack.with(Items.copper, 10));
        }};
        beamDrill = new BeamDrill("beamDrill") {{
            tier = 10;
            size = 1;
            health = 100;
            itemCapacity = 20;
            alwaysUnlocked = true;
            requirements(Category.production, ItemStack.with(Items.beryllium, 10));
        }};
    }


}

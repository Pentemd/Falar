package fr.pentalonwaterprof.falar.init;

import fr.pentalonwaterprof.falar.utils.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "falar");

    public static final RegistryObject<Block> AMETHYST_BLOCK = createBlock("amethyst_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> TITANE_BLOCK = createBlock("titane_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 18f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> PALADIUM_BLOCK = createBlock("paladium_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 20f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> PALADIUM_GREEN_BLOCK = createBlock("paladium_green_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(4f, 23f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> ENDIUM_BLOCK = createBlock("endium_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(4f, 25f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> FINDIUM_BLOCK = createBlock("findium_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 21f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));

    public static final RegistryObject<Block> PALADIUM_ORE = createBlock("paladium_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 20f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> FINDIUM_ORE = createBlock("findium_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 21f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> PALADIUM_GREEN_ORE = createBlock("paladium_green_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(4f, 23f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> AMETHYST_ORE = createBlock("amethyst_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.2f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> TITANE_ORE = createBlock("titane_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 17f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));


    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroups.FALAR_TAB)));
        return block;
    }
}

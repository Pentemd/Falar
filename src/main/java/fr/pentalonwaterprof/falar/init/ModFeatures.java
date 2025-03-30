package fr.pentalonwaterprof.falar.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModFeatures {
    public ConfiguredFeature<?, ?> ORE_FINDIUM_FEATURE;
    public ConfiguredFeature<?, ?> ORE_PALADIUM_FEATURE;
    public ConfiguredFeature<?, ?> ORE_PALADIUM_GREEN_FEATURE;
    public ConfiguredFeature<?, ?> ORE_TITANE_FEATURE;
    public ConfiguredFeature<?, ?> ORE_AMETHYST_FEATURE;

    public void init() {

        ORE_PALADIUM_FEATURE = register("ore_paladium", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.PALADIUM_ORE.get().getDefaultState(), 5))
                .square()
                .range(12)
                .func_242731_b(5)); // 20 : 20 minerai par chunk
        ORE_FINDIUM_FEATURE = register("ore_findium", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.FINDIUM_ORE.get().getDefaultState(), 5))
                .square()
                .range(12)
                .func_242731_b(5)); // 20 : 20 minerai par chunk

        ORE_AMETHYST_FEATURE = register("ore_amethyst", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AMETHYST_ORE.get().getDefaultState(), 8))
                .square()
                .range(30)
                .func_242731_b(8)); // 20 : 20 minerai par chunk
        ORE_TITANE_FEATURE = register("ore_titane", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.TITANE_ORE.get().getDefaultState(), 8))
                .square()
                .range(20) // a partir de quel couche
                .func_242731_b(7)); // 20 : 20 minerai par chunk
        ORE_PALADIUM_GREEN_FEATURE = register("ore_paladium_green", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.PALADIUM_GREEN_ORE.get().getDefaultState(), 2))
                .square()
                .range(10)
                .func_242731_b(2)); // 20 : 20 minerai par chunk
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeLoading(BiomeLoadingEvent e) {
        BiomeGenerationSettingsBuilder generation = e.getGeneration();
        // rien besoin de fairede plus si veux que minerai pop partout
        if (e.getCategory() != Biome.Category.NETHER) {
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_PALADIUM_FEATURE);
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_FINDIUM_FEATURE);
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_AMETHYST_FEATURE);
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_TITANE_FEATURE);
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_PALADIUM_GREEN_FEATURE);
        }


        // ~ ~ ~ ~ ~ ~
    }
}

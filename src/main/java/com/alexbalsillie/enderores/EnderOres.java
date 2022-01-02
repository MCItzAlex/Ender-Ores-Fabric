package  com.alexbalsillie.enderores;

import com.alexbalsillie.enderores.registry.ModBlocks;
import com.alexbalsillie.enderores.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class EnderOres implements ModInitializer {

	public static final String MOD_ID = "enderores";

	//coal ore generation
	private static ConfiguredFeature<?, ?> END_COAL_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_COAL_ORE.getDefaultState(),
					12)); // vein size

	public static PlacedFeature END_COAL_ORE_PLACED_FEATURE = END_COAL_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(10), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//iron ore generation
	private static ConfiguredFeature<?, ?> END_IRON_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_IRON_ORE.getDefaultState(),
					7)); // vein size

	public static PlacedFeature END_IRON_ORE_PLACED_FEATURE = END_IRON_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(9), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//copper ore generation
	private static ConfiguredFeature<?, ?> END_COPPER_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_COPPER_ORE.getDefaultState(),
					8)); // vein size

	public static PlacedFeature END_COPPER_ORE_PLACED_FEATURE = END_COPPER_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(9), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//gold ore generation
	private static ConfiguredFeature<?, ?> END_GOLD_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_GOLD_ORE.getDefaultState(),
					9)); // vein size

	public static PlacedFeature END_GOLD_ORE_PLACED_FEATURE = END_GOLD_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(6), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//lapis ore generation
	private static ConfiguredFeature<?, ?> END_LAPIS_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_LAPIS_ORE.getDefaultState(),
					10)); // vein size

	public static PlacedFeature END_LAPIS_ORE_PLACED_FEATURE = END_LAPIS_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(6), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//redstone ore generation
	private static ConfiguredFeature<?, ?> END_REDSTONE_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_REDSTONE_ORE.getDefaultState(),
					10)); // vein size

	public static PlacedFeature END_REDSTONE_ORE_PLACED_FEATURE = END_REDSTONE_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(5), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//diamond ore generation
	private static ConfiguredFeature<?, ?> END_DIAMOND_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_DIAMOND_ORE.getDefaultState(),
					6)); // vein size

	public static PlacedFeature END_DIAMOND_ORE_PLACED_FEATURE = END_DIAMOND_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(4), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height


	//emerald ore generation
	private static ConfiguredFeature<?, ?> END_EMERALD_ORE_CONFIGURED_FEATURE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					ModBlocks.END_EMERALD_ORE.getDefaultState(),
					1)); // vein size

	public static PlacedFeature END_EMERALD_ORE_PLACED_FEATURE = END_EMERALD_ORE_CONFIGURED_FEATURE.withPlacement(
			CountPlacementModifier.of(2), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))); // height



	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		//coal ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_coal_ore"), END_COAL_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_coal_ore"),
				END_COAL_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_coal_ore")));

		//iron ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_iron_ore"), END_IRON_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_iron_ore"),
				END_IRON_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_iron_ore")));

		//copper ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_copper_ore"), END_COPPER_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_copper_ore"),
				END_COPPER_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_copper_ore")));

		//gold ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_gold_ore"), END_GOLD_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_gold_ore"),
				END_GOLD_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_gold_ore")));

		//lapis ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_lapis_ore"), END_LAPIS_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_lapis_ore"),
				END_LAPIS_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_lapis_ore")));

		//redstone ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_redstone_ore"), END_REDSTONE_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_redstone_ore"),
				END_REDSTONE_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_redstone_ore")));

		//diamond ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_diamond_ore"), END_DIAMOND_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_diamond_ore"),
				END_DIAMOND_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_diamond_ore")));

		//emerald ore register
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("enderores", "end_emerald_ore"), END_EMERALD_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("enderores", "end_emerald_ore"),
				END_EMERALD_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("enderores", "end_emerald_ore")));


	}
}
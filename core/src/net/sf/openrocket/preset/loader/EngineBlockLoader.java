package net.sf.openrocket.preset.loader;

import net.sf.openrocket.preset.ComponentPreset;
import net.sf.openrocket.preset.ComponentPreset.Type;

import java.io.File;

public class EngineBlockLoader extends BodyTubeLoader {

	public EngineBlockLoader(MaterialHolder materials, File theBasePath) {
		super(materials, theBasePath);
	}

	@Override
	protected Type getComponentPresetType() {
		return ComponentPreset.Type.ENGINE_BLOCK;
	}

	@Override
	protected RockSimComponentFileType getFileType() {
		return RockSimComponentFileType.ENGINE_BLOCK;
	}

}

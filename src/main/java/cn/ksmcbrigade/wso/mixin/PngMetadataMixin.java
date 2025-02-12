package cn.ksmcbrigade.wso.mixin;

import net.minecraft.util.PngMetadata;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.nio.ByteBuffer;

@Mixin(PngMetadata.class)
public class PngMetadataMixin {
    @Inject(method = "validate",at = @At("HEAD"), cancellable = true)
    private static void val(ByteBuffer buf, CallbackInfo ci){
        ci.cancel();
    }
}

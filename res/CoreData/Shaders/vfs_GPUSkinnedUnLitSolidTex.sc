�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�5py|pj���Rv��!B1��!�u�'aQ����ؕpՀ��$HH�zL�hC��J���\D��Y:@2��,#�#�G{���"�,S��dP������`����xO���8��DJ+I�$�暴U" ��3I�OF������q%��j����HT+������ՄV�#p6y������Eo����o�~O }f�ޜ�Х$e��	k�\W�|_K�L��㏌_��m�y���Y����5p�S�B�Vr��QC|��#�SnyF�n%��^����-�h����mO�]l�@��:D����#�P����`!�1=�;Mʐ�R�쫟,)^���/b�yp�������[��7�%���~��>V-Vٔb��'�^��'���8/x��`�U=P'�u�-U����z�Ϲ@��ɉRޭ�B+�øȾpO1�k^��l�o^,qD�����[<include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///�input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void�main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif

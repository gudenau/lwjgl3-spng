/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package spng.templates;

import org.lwjgl.generator.*
import spng.*

val spng = "Spng".nativeClass(Module.SPNG, prefix = "SPNG", prefixMethod = "spng_") {
    //nativeImport("spng.h")
    nativeDirective("""
#define SPNG_USE_MINIZ
        
#include "miniz.c"
#include "spng.c"

typedef struct spng_ihdr spng_ihdr;
typedef struct spng_plte_entry spng_plte_entry;
typedef struct spng_plte spng_plte;
typedef struct spng_trns spng_trns;
typedef struct spng_chrm_int spng_chrm_int;
typedef struct spng_chrm spng_chrm;
typedef struct spng_iccp spng_iccp;
typedef struct spng_sbit spng_sbit;
typedef struct spng_text spng_text;
typedef struct spng_bkgd spng_bkgd;
typedef struct spng_hist spng_hist;
typedef struct spng_phys spng_phys;
typedef struct spng_splt_entry spng_splt_entry;
typedef struct spng_splt spng_splt;
typedef struct spng_time spng_time;
typedef struct spng_offs spng_offs;
typedef struct spng_exif spng_exif;
typedef struct spng_chunk spng_chunk;
typedef struct spng_unknown_chunk spng_unknown_chunk;
typedef struct spng_alloc spng_alloc;
typedef struct spng_row_info spng_row_info;

typedef enum spng_option spng_option;
    """.trimMargin())

    /*TODO?
    #define SPNG_VERSION_MAJOR 0
    #define SPNG_VERSION_MINOR 7
    #define SPNG_VERSION_PATCH 4
     */

    EnumConstant(
        "SPNG_IO_ERROR".enum("-2"),
        "SPNG_IO_EOF".enum("-1"),
        "SPNG_OK".enum("0"),
        "SPNG_EINVAL".enum,
        "SPNG_EMEM".enum,
        "SPNG_EOVERFLOW".enum,
        "SPNG_ESIGNATURE".enum,
        "SPNG_EWIDTH".enum,
        "SPNG_EHEIGHT".enum,
        "SPNG_EUSER_WIDTH".enum,
        "SPNG_EUSER_HEIGHT".enum,
        "SPNG_EBIT_DEPTH".enum,
        "SPNG_ECOLOR_TYPE".enum,
        "SPNG_ECOMPRESSION_METHOD".enum,
        "SPNG_EFILTER_METHOD".enum,
        "SPNG_EINTERLACE_METHOD".enum,
        "SPNG_EIHDR_SIZE".enum,
        "SPNG_ENOIHDR".enum,
        "SPNG_ECHUNK_POS".enum,
        "SPNG_ECHUNK_SIZE".enum,
        "SPNG_ECHUNK_CRC".enum,
        "SPNG_ECHUNK_TYPE".enum,
        "SPNG_ECHUNK_UNKNOWN_CRITICAL".enum,
        "SPNG_EDUP_PLTE".enum,
        "SPNG_EDUP_CHRM".enum,
        "SPNG_EDUP_GAMA".enum,
        "SPNG_EDUP_ICCP".enum,
        "SPNG_EDUP_SBIT".enum,
        "SPNG_EDUP_SRGB".enum,
        "SPNG_EDUP_BKGD".enum,
        "SPNG_EDUP_HIST".enum,
        "SPNG_EDUP_TRNS".enum,
        "SPNG_EDUP_PHYS".enum,
        "SPNG_EDUP_TIME".enum,
        "SPNG_EDUP_OFFS".enum,
        "SPNG_EDUP_EXIF".enum,
        "SPNG_ECHRM".enum,
        "SPNG_EPLTE_IDX".enum,
        "SPNG_ETRNS_COLOR_TYPE".enum,
        "SPNG_ETRNS_NO_PLTE".enum,
        "SPNG_EGAMA".enum,
        "SPNG_EICCP_NAME".enum,
        "SPNG_EICCP_COMPRESSION_METHOD".enum,
        "SPNG_ESBIT".enum,
        "SPNG_ESRGB".enum,
        "SPNG_ETEXT".enum,
        "SPNG_ETEXT_KEYWORD".enum,
        "SPNG_EZTXT".enum,
        "SPNG_EZTXT_COMPRESSION_METHOD".enum,
        "SPNG_EITXT".enum,
        "SPNG_EITXT_COMPRESSION_FLAG".enum,
        "SPNG_EITXT_COMPRESSION_METHOD".enum,
        "SPNG_EITXT_LANG_TAG".enum,
        "SPNG_EITXT_TRANSLATED_KEY".enum,
        "SPNG_EBKGD_NO_PLTE".enum,
        "SPNG_EBKGD_PLTE_IDX".enum,
        "SPNG_EHIST_NO_PLTE".enum,
        "SPNG_EPHYS".enum,
        "SPNG_ESPLT_NAME".enum,
        "SPNG_ESPLT_DUP_NAME".enum,
        "SPNG_ESPLT_DEPTH".enum,
        "SPNG_ETIME".enum,
        "SPNG_EOFFS".enum,
        "SPNG_EEXIF".enum,
        "SPNG_EIDAT_TOO_SHORT".enum,
        "SPNG_EIDAT_STREAM".enum,
        "SPNG_EZLIB".enum,
        "SPNG_EFILTER".enum,
        "SPNG_EBUFSIZ".enum,
        "SPNG_EIO".enum,
        "SPNG_EOF".enum,
        "SPNG_EBUF_SET".enum,
        "SPNG_EBADSTATE".enum,
        "SPNG_EFMT".enum,
        "SPNG_EFLAGS".enum,
        "SPNG_ECHUNKAVAIL".enum,
        "SPNG_ENCODE_ONLY".enum,
        "SPNG_EOI".enum,
        "SPNG_ENOPLTE".enum,
        "SPNG_ECHUNK_LIMITS".enum,
        "SPNG_EZLIB_INIT".enum,
        "SPNG_ECHUNK_STDLEN".enum,
        "SPNG_EINTERNAL".enum,
        "SPNG_ECTXTYPE".enum,
        "SPNG_ENOSRC".enum,
        "SPNG_ENODST".enum,
        "SPNG_EOPSTATE".enum,
        "SPNG_ENOTFINAL".enum
    )

    EnumConstant(
        "SPNG_TEXT".enum("1"),
        "SPNG_ZTXT".enum("2"),
        "SPNG_ITXT".enum("3")
    )

    EnumConstant(
        "SPNG_COLOR_TYPE_GRAYSCALE".enum("0"),
        "SPNG_COLOR_TYPE_TRUECOLOR".enum("2"),
        "SPNG_COLOR_TYPE_INDEXED".enum("3"),
        "SPNG_COLOR_TYPE_GRAYSCALE_ALPHA".enum("4"),
        "SPNG_COLOR_TYPE_TRUECOLOR_ALPHA".enum("6")
    )

    EnumConstant(
        "SPNG_FILTER_NONE".enum("0"),
        "SPNG_FILTER_SUB".enum("1"),
        "SPNG_FILTER_UP".enum("2"),
        "SPNG_FILTER_AVERAGE".enum("3"),
        "SPNG_FILTER_PAETH".enum("4")
    )

    EnumConstant(
        "SPNG_DISABLE_FILTERING".enum("0"),
        "SPNG_FILTER_CHOICE_NONE".enum("8"),
        "SPNG_FILTER_CHOICE_SUB".enum("16"),
        "SPNG_FILTER_CHOICE_UP".enum("32"),
        "SPNG_FILTER_CHOICE_AVG".enum("64"),
        "SPNG_FILTER_CHOICE_PAETH".enum("128"),
        "SPNG_FILTER_CHOICE_ALL".enum("(8|16|32|64|128)")
    )

    EnumConstant(
        "SPNG_INTERLACE_NONE".enum("0"),
        "SPNG_INTERLACE_ADAM7".enum("1")
    )

/* Channels are always in byte-order */
    EnumConstant(
        "SPNG_FMT_RGBA8".enum("1"),
        "SPNG_FMT_RGBA16".enum("2"),
        "SPNG_FMT_RGB8".enum("4"),

    /* Partially implemented, see documentation */
        "SPNG_FMT_GA8".enum("16"),
        "SPNG_FMT_GA16".enum("32"),
        "SPNG_FMT_G8".enum("64"),

    /* No conversion or scaling */
        "SPNG_FMT_PNG".enum("256"),
        "SPNG_FMT_RAW".enum("512")  /* big-endian (everything else is host-endian) */
    )

    EnumConstant(
        "SPNG_CTX_IGNORE_ADLER32".enum("1"), /* Ignore checksum in DEFLATE streams */
        "SPNG_CTX_ENCODER".enum("2") /* Create an encoder context */
    )

    EnumConstant(
        "SPNG_DECODE_USE_TRNS".enum("1"), /* Deprecated */
        "SPNG_DECODE_USE_GAMA".enum("2"), /* Deprecated */
        "SPNG_DECODE_USE_SBIT".enum("8"), /* Undocumented */

        "SPNG_DECODE_TRNS".enum("1"), /* Apply transparency */
        "SPNG_DECODE_GAMMA".enum("2"), /* Apply gamma correction */
        "SPNG_DECODE_PROGRESSIVE".enum("256") /* Initialize for progressive reads */
    )

    EnumConstant(
    /* Default for critical chunks */
        "SPNG_CRC_ERROR".enum("0"),

    /* Discard chunk, invalid for critical chunks.
       Since v0.6.2: default for ancillary chunks */
        "SPNG_CRC_DISCARD".enum("1"),

    /* Ignore and don't calculate checksum.
       Since v0.6.2: also ignores checksums in DEFLATE streams */
        "SPNG_CRC_USE".enum("2")
    )

    EnumConstant(
        "SPNG_ENCODE_PROGRESSIVE".enum("1"), /* Initialize for progressive writes */
        "SPNG_ENCODE_FINALIZE".enum("2") /* Finalize PNG after encoding image */
    )

    EnumConstant(
        "SPNG_AFTER_IHDR".enum("1"),
        "SPNG_AFTER_PLTE".enum("2"),
        "SPNG_AFTER_IDAT".enum("8")
    )

    EnumConstant(
        "SPNG_KEEP_UNKNOWN_CHUNKS".enum("1"),

        "SPNG_IMG_COMPRESSION_LEVEL".enum,
        "SPNG_IMG_WINDOW_BITS".enum,
        "SPNG_IMG_MEM_LEVEL".enum,
        "SPNG_IMG_COMPRESSION_STRATEGY".enum,

        "SPNG_TEXT_COMPRESSION_LEVEL".enum,
        "SPNG_TEXT_WINDOW_BITS".enum,
        "SPNG_TEXT_MEM_LEVEL".enum,
        "SPNG_TEXT_COMPRESSION_STRATEGY".enum,

        "SPNG_FILTER_CHOICE".enum,
        "SPNG_CHUNK_COUNT_LIMIT".enum,
        "SPNG_ENCODE_TO_BUFFER".enum,
    )

    spng_ctx.p(
        "ctx_new",

        int("flags")
    )
    spng_ctx.p(
        "ctx_new2",

        spng_alloc.p("alloc"),
        int("flags")
    )
    void(
        "ctx_free",

        spng_ctx.p("ctx")
    )

    int(
        "set_png_buffer",

        spng_ctx.p("ctx"),
        void.const.p("buf"),
        AutoSize("buf")..size_t("size")
    )
    int(
        "set_png_stream",

        spng_ctx.p("ctx"),
        Check(1)..spng_rw_fn.p("rw_func"),
        opaque_p("user")
    )
    /*TODO?
    int(
        "set_png_file",

        spng_ctx.p("ctx"),
        FILE.p("file")
    )
     */

    void.p(
        "get_png_buffer",

        spng_ctx.p("ctx"),
        AutoSizeResult..Check(1)..size_t.p("len"),
        Check(1)..int.p("error")
    )

    int(
        "set_image_limits",

        spng_ctx.p("ctx"),
        uint32_t("width"),
        uint32_t("height")
    )
    int(
        "get_image_limits",

        spng_ctx.p("ctx"),
        Check(1)..uint32_t.p("width"),
        Check(1)..uint32_t.p("height")
    )

    int(
        "set_chunk_limits",

        spng_ctx.p("ctx"),
        size_t("chunk_size"),
        size_t("cache_size")
    )
    int(
        "get_chunk_limits",

        spng_ctx.p("ctx"),
        Check(1)..size_t.p("chunk_size"),
        Check(1)..size_t.p("cache_size")
    )

    int(
        "set_crc_action",

        spng_ctx.p("ctx"),
        int("critical"),
        int("ancillary")
    )

    int(
        "set_option",

        spng_ctx.p("ctx"),
        spng_option("option"),
        int("value")
    )
    int(
        "get_option",

        spng_ctx.p("ctx"),
        spng_option("option"),
        Check(1)..int.p("value")
    )

    int(
        "decoded_image_size",

        spng_ctx.p("ctx"),
        int("fmt"),
        Check(1)..size_t.p("len")
    )

    /* Decode */
    int(
        "decode_image",

        spng_ctx.p("ctx"),
        void.p("out"),
        AutoSize("out")..size_t("len"),
        int("fmt"),
        int("flags")
    )

    /* Progressive decode */
    int(
        "decode_scanline",

        spng_ctx.p("ctx"),
        void.p("out"),
        AutoSize("out")..size_t("len")
    )
    int(
        "decode_row",

        spng_ctx.p("ctx"),
        void.p("out"),
        AutoSize("out")..size_t("len")
    )
    int(
        "decode_chunks",

        spng_ctx.p("ctx")
    )

    /* Encode/decode */
    int(
        "get_row_info",

        spng_ctx.p("ctx"),
        spng_row_info.p("row_info")
    )

    /* Encode */
    int(
        "encode_image",

        spng_ctx.p("ctx"),
        void.const.p("img"),
        AutoSize("img")..size_t("len"),
        int("fmt"),
        int("flags")
    )

    /* Progressive encode */
    int(
        "encode_scanline",

        spng_ctx.p("ctx"),
        void.const.p("scanline"),
        AutoSize("scanline")..size_t("len")
    )
    int(
        "encode_row",

        spng_ctx.p("ctx"),
        void.const.p("row"),
        AutoSize("row")..size_t("len")
    )
    int(
        "encode_chunks",

        spng_ctx.p("ctx")
    )

    int(
        "get_ihdr",

        spng_ctx.p("ctx"),
        spng_ihdr.p("ihdr")
    )
    int(
        "get_plte",

        spng_ctx.p("ctx"),
        spng_plte.p("plte")
    )
    int(
        "get_trns",

        spng_ctx.p("ctx"),
        spng_trns.p("trns")
    )
    int(
        "get_chrm",

        spng_ctx.p("ctx"),
        spng_chrm.p("chrm")
    )
    int(
        "get_chrm_int",

        spng_ctx.p("ctx"),
        spng_chrm_int.p("chrm_int")
    )
    int(
        "get_gama",

        spng_ctx.p("ctx"),
        Check(1)..double.p("gamma")
    )
    int(
        "get_gama_int",

        spng_ctx.p("ctx"),
        Check(1)..uint32_t.p("gama_int")
    )
    int(
        "get_iccp",

        spng_ctx.p("ctx"),
        spng_iccp.p("iccp")
    )
    int(
        "get_sbit",

        spng_ctx.p("ctx"),
        spng_sbit.p("sbit")
    )
    int(
        "get_srgb",

        spng_ctx.p("ctx"),
        Check(1)..uint8_t.p("rendering_intent")
    )
    int(
        "get_text",

        spng_ctx.p("ctx"),
        spng_text.p("text"),
        Check(1)..uint32_t.p("n_text")
    )
    int(
        "get_bkgd",

        spng_ctx.p("ctx"),
        spng_bkgd.p("bkgd")
    )
    int(
        "get_hist",

        spng_ctx.p("ctx"),
        spng_hist.p("hist")
    )
    int(
        "get_phys",

        spng_ctx.p("ctx"),
        spng_phys.p("phys")
    )
    int(
        "get_splt",

        spng_ctx.p("ctx"),
        spng_splt.p("splt"),
        Check(1)..uint32_t.p("n_splt")
    )
    int(
        "get_time",

        spng_ctx.p("ctx"),
        spng_time.p("time")
    )
    int(
        "get_unknown_chunks",

        spng_ctx.p("ctx"),
        spng_unknown_chunk.p("chunks"),
        Check(1)..uint32_t.p("n_chunks")
    )

    /* Official extensions */
    int(
        "get_offs",

        spng_ctx.p("ctx"),
        spng_offs.p("offs")
    )
    int(
        "get_exif",

        spng_ctx.p("ctx"),
        spng_exif.p("exif")
    )


    int(
        "set_ihdr",

        spng_ctx.p("ctx"),
        spng_ihdr.p("ihdr")
    )
    int(
        "set_plte",

        spng_ctx.p("ctx"),
        spng_plte.p("plte")
    )
    int(
        "set_trns",

        spng_ctx.p("ctx"),
        spng_trns.p("trns")
    )
    int(
        "set_chrm",

        spng_ctx.p("ctx"),
        spng_chrm.p("chrm")
    )
    int(
        "set_chrm_int",

        spng_ctx.p("ctx"),
        spng_chrm_int.p("chrm_int")
    )
    int(
        "set_gama",

        spng_ctx.p("ctx"),
        double("gamma")
    )
    int(
        "set_gama_int",

        spng_ctx.p("ctx"),
        uint32_t("gamma")
    )
    int(
        "set_iccp",

        spng_ctx.p("ctx"),
        spng_iccp.p("iccp")
    )
    int(
        "set_sbit",

        spng_ctx.p("ctx"),
        spng_sbit.p("sbit")
    )
    int(
        "set_srgb",

        spng_ctx.p("ctx"),
        uint8_t("rendering_intent")
    )
    int(
        "set_text",

        spng_ctx.p("ctx"),
        spng_text.p("text"),
        uint32_t("n_text")
    )
    int(
        "set_bkgd",

        spng_ctx.p("ctx"),
        spng_bkgd.p("bkgd")
    )
    int(
        "set_hist",

        spng_ctx.p("ctx"),
        spng_hist.p("hist")
    )
    int(
        "set_phys",

        spng_ctx.p("ctx"),
        spng_phys.p("phys")
    )
    int(
        "set_splt",

        spng_ctx.p("ctx"),
        spng_splt.p("splt"),
        uint32_t("n_splt")
    )
    int(
        "set_time",

        spng_ctx.p("ctx"),
        spng_time.p("time")
    )
    int(
        "set_unknown_chunks",

        spng_ctx.p("ctx"),
        spng_unknown_chunk.p("chunks"),
        uint32_t("n_chunks")
    )

    /* Official extensions */
    int(
        "set_offs",

        spng_ctx.p("ctx"),
        spng_offs.p("offs")
    )
    int(
        "set_exif",

        spng_ctx.p("ctx"),
        spng_exif.p("exif")
    )

    charASCII.const.p(
        "strerror",

        int("err")
    )
    charASCII.const.p(
        "version_string",

        void()
    )
}

-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseSetGuildAnno_pb', package.seeall)


local BSESETGUILDANNO = protobuf.Descriptor();
local BSESETGUILDANNO_ANNO_FIELD = protobuf.FieldDescriptor();

BSESETGUILDANNO_ANNO_FIELD.name = "anno"
BSESETGUILDANNO_ANNO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseSetGuildAnno.anno"
BSESETGUILDANNO_ANNO_FIELD.number = 1
BSESETGUILDANNO_ANNO_FIELD.index = 0
BSESETGUILDANNO_ANNO_FIELD.label = 2
BSESETGUILDANNO_ANNO_FIELD.has_default_value = false
BSESETGUILDANNO_ANNO_FIELD.default_value = ""
BSESETGUILDANNO_ANNO_FIELD.type = 9
BSESETGUILDANNO_ANNO_FIELD.cpp_type = 9

BSESETGUILDANNO.name = "BseSetGuildAnno"
BSESETGUILDANNO.full_name = ".com.xinqihd.sns.gameserver.proto.BseSetGuildAnno"
BSESETGUILDANNO.nested_types = {}
BSESETGUILDANNO.enum_types = {}
BSESETGUILDANNO.fields = {BSESETGUILDANNO_ANNO_FIELD}
BSESETGUILDANNO.is_extendable = false
BSESETGUILDANNO.extensions = {}

BseSetGuildAnno = protobuf.Message(BSESETGUILDANNO)
_G.BSESETGUILDANNO_PB_BSESETGUILDANNO = BSESETGUILDANNO

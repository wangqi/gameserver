-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseChangeMap_pb', package.seeall)


local BSECHANGEMAP = protobuf.Descriptor();
local BSECHANGEMAP_MAPID_FIELD = protobuf.FieldDescriptor();
local BSECHANGEMAP_CHANGEUSERID_FIELD = protobuf.FieldDescriptor();

BSECHANGEMAP_MAPID_FIELD.name = "mapID"
BSECHANGEMAP_MAPID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseChangeMap.mapID"
BSECHANGEMAP_MAPID_FIELD.number = 1
BSECHANGEMAP_MAPID_FIELD.index = 0
BSECHANGEMAP_MAPID_FIELD.label = 2
BSECHANGEMAP_MAPID_FIELD.has_default_value = false
BSECHANGEMAP_MAPID_FIELD.default_value = 0
BSECHANGEMAP_MAPID_FIELD.type = 5
BSECHANGEMAP_MAPID_FIELD.cpp_type = 1

BSECHANGEMAP_CHANGEUSERID_FIELD.name = "changeUserID"
BSECHANGEMAP_CHANGEUSERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseChangeMap.changeUserID"
BSECHANGEMAP_CHANGEUSERID_FIELD.number = 2
BSECHANGEMAP_CHANGEUSERID_FIELD.index = 1
BSECHANGEMAP_CHANGEUSERID_FIELD.label = 2
BSECHANGEMAP_CHANGEUSERID_FIELD.has_default_value = false
BSECHANGEMAP_CHANGEUSERID_FIELD.default_value = ""
BSECHANGEMAP_CHANGEUSERID_FIELD.type = 9
BSECHANGEMAP_CHANGEUSERID_FIELD.cpp_type = 9

BSECHANGEMAP.name = "BseChangeMap"
BSECHANGEMAP.full_name = ".com.xinqihd.sns.gameserver.proto.BseChangeMap"
BSECHANGEMAP.nested_types = {}
BSECHANGEMAP.enum_types = {}
BSECHANGEMAP.fields = {BSECHANGEMAP_MAPID_FIELD, BSECHANGEMAP_CHANGEUSERID_FIELD}
BSECHANGEMAP.is_extendable = false
BSECHANGEMAP.extensions = {}

BseChangeMap = protobuf.Message(BSECHANGEMAP)
_G.BSECHANGEMAP_PB_BSECHANGEMAP = BSECHANGEMAP


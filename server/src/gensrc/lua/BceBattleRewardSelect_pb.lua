-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceBattleRewardSelect_pb', package.seeall)


local BCEBATTLEREWARDSELECT = protobuf.Descriptor();
local BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD = protobuf.FieldDescriptor();

BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.name = "slotIndex"
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBattleRewardSelect.slotIndex"
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.number = 1
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.index = 0
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.label = 3
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.has_default_value = false
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.default_value = {}
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.type = 5
BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD.cpp_type = 1

BCEBATTLEREWARDSELECT.name = "BceBattleRewardSelect"
BCEBATTLEREWARDSELECT.full_name = ".com.xinqihd.sns.gameserver.proto.BceBattleRewardSelect"
BCEBATTLEREWARDSELECT.nested_types = {}
BCEBATTLEREWARDSELECT.enum_types = {}
BCEBATTLEREWARDSELECT.fields = {BCEBATTLEREWARDSELECT_SLOTINDEX_FIELD}
BCEBATTLEREWARDSELECT.is_extendable = false
BCEBATTLEREWARDSELECT.extensions = {}

BceBattleRewardSelect = protobuf.Message(BCEBATTLEREWARDSELECT)
_G.BCEBATTLEREWARDSELECT_PB_BCEBATTLEREWARDSELECT = BCEBATTLEREWARDSELECT


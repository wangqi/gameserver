-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseRoleChangeDirection_pb', package.seeall)


local BSEROLECHANGEDIRECTION = protobuf.Descriptor();
local BSEROLECHANGEDIRECTION_SESSIONID_FIELD = protobuf.FieldDescriptor();
local BSEROLECHANGEDIRECTION_DIRECTION_FIELD = protobuf.FieldDescriptor();

BSEROLECHANGEDIRECTION_SESSIONID_FIELD.name = "sessionId"
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleChangeDirection.sessionId"
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.number = 1
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.index = 0
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.label = 2
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.has_default_value = false
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.default_value = ""
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.type = 9
BSEROLECHANGEDIRECTION_SESSIONID_FIELD.cpp_type = 9

BSEROLECHANGEDIRECTION_DIRECTION_FIELD.name = "direction"
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleChangeDirection.direction"
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.number = 2
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.index = 1
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.label = 2
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.has_default_value = false
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.default_value = 0
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.type = 5
BSEROLECHANGEDIRECTION_DIRECTION_FIELD.cpp_type = 1

BSEROLECHANGEDIRECTION.name = "BseRoleChangeDirection"
BSEROLECHANGEDIRECTION.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleChangeDirection"
BSEROLECHANGEDIRECTION.nested_types = {}
BSEROLECHANGEDIRECTION.enum_types = {}
BSEROLECHANGEDIRECTION.fields = {BSEROLECHANGEDIRECTION_SESSIONID_FIELD, BSEROLECHANGEDIRECTION_DIRECTION_FIELD}
BSEROLECHANGEDIRECTION.is_extendable = false
BSEROLECHANGEDIRECTION.extensions = {}

BseRoleChangeDirection = protobuf.Message(BSEROLECHANGEDIRECTION)
_G.BSEROLECHANGEDIRECTION_PB_BSEROLECHANGEDIRECTION = BSEROLECHANGEDIRECTION


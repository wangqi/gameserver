-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseError_pb', package.seeall)


local BSEERROR = protobuf.Descriptor();
local BSEERROR_ERRORID_FIELD = protobuf.FieldDescriptor();
local BSEERROR_SESSIONID_FIELD = protobuf.FieldDescriptor();
local BSEERROR_ROOMID_FIELD = protobuf.FieldDescriptor();

BSEERROR_ERRORID_FIELD.name = "errorID"
BSEERROR_ERRORID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseError.errorID"
BSEERROR_ERRORID_FIELD.number = 1
BSEERROR_ERRORID_FIELD.index = 0
BSEERROR_ERRORID_FIELD.label = 2
BSEERROR_ERRORID_FIELD.has_default_value = false
BSEERROR_ERRORID_FIELD.default_value = 0
BSEERROR_ERRORID_FIELD.type = 5
BSEERROR_ERRORID_FIELD.cpp_type = 1

BSEERROR_SESSIONID_FIELD.name = "sessionID"
BSEERROR_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseError.sessionID"
BSEERROR_SESSIONID_FIELD.number = 2
BSEERROR_SESSIONID_FIELD.index = 1
BSEERROR_SESSIONID_FIELD.label = 1
BSEERROR_SESSIONID_FIELD.has_default_value = false
BSEERROR_SESSIONID_FIELD.default_value = ""
BSEERROR_SESSIONID_FIELD.type = 9
BSEERROR_SESSIONID_FIELD.cpp_type = 9

BSEERROR_ROOMID_FIELD.name = "roomID"
BSEERROR_ROOMID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseError.roomID"
BSEERROR_ROOMID_FIELD.number = 3
BSEERROR_ROOMID_FIELD.index = 2
BSEERROR_ROOMID_FIELD.label = 1
BSEERROR_ROOMID_FIELD.has_default_value = false
BSEERROR_ROOMID_FIELD.default_value = 0
BSEERROR_ROOMID_FIELD.type = 5
BSEERROR_ROOMID_FIELD.cpp_type = 1

BSEERROR.name = "BseError"
BSEERROR.full_name = ".com.xinqihd.sns.gameserver.proto.BseError"
BSEERROR.nested_types = {}
BSEERROR.enum_types = {}
BSEERROR.fields = {BSEERROR_ERRORID_FIELD, BSEERROR_SESSIONID_FIELD, BSEERROR_ROOMID_FIELD}
BSEERROR.is_extendable = false
BSEERROR.extensions = {}

BseError = protobuf.Message(BSEERROR)
_G.BSEERROR_PB_BSEERROR = BSEERROR


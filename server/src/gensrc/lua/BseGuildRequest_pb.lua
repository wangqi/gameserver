-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildRequest_pb', package.seeall)


local BSEGUILDREQUEST = protobuf.Descriptor();
local BSEGUILDREQUEST_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEGUILDREQUEST_GUILDID_FIELD = protobuf.FieldDescriptor();
local BSEGUILDREQUEST_GUILDNAME_FIELD = protobuf.FieldDescriptor();

BSEGUILDREQUEST_RESULT_FIELD.name = "result"
BSEGUILDREQUEST_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildRequest.result"
BSEGUILDREQUEST_RESULT_FIELD.number = 1
BSEGUILDREQUEST_RESULT_FIELD.index = 0
BSEGUILDREQUEST_RESULT_FIELD.label = 2
BSEGUILDREQUEST_RESULT_FIELD.has_default_value = false
BSEGUILDREQUEST_RESULT_FIELD.default_value = 0
BSEGUILDREQUEST_RESULT_FIELD.type = 5
BSEGUILDREQUEST_RESULT_FIELD.cpp_type = 1

BSEGUILDREQUEST_GUILDID_FIELD.name = "guildID"
BSEGUILDREQUEST_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildRequest.guildID"
BSEGUILDREQUEST_GUILDID_FIELD.number = 2
BSEGUILDREQUEST_GUILDID_FIELD.index = 1
BSEGUILDREQUEST_GUILDID_FIELD.label = 1
BSEGUILDREQUEST_GUILDID_FIELD.has_default_value = false
BSEGUILDREQUEST_GUILDID_FIELD.default_value = 0
BSEGUILDREQUEST_GUILDID_FIELD.type = 5
BSEGUILDREQUEST_GUILDID_FIELD.cpp_type = 1

BSEGUILDREQUEST_GUILDNAME_FIELD.name = "guildName"
BSEGUILDREQUEST_GUILDNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildRequest.guildName"
BSEGUILDREQUEST_GUILDNAME_FIELD.number = 3
BSEGUILDREQUEST_GUILDNAME_FIELD.index = 2
BSEGUILDREQUEST_GUILDNAME_FIELD.label = 1
BSEGUILDREQUEST_GUILDNAME_FIELD.has_default_value = false
BSEGUILDREQUEST_GUILDNAME_FIELD.default_value = ""
BSEGUILDREQUEST_GUILDNAME_FIELD.type = 9
BSEGUILDREQUEST_GUILDNAME_FIELD.cpp_type = 9

BSEGUILDREQUEST.name = "BseGuildRequest"
BSEGUILDREQUEST.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildRequest"
BSEGUILDREQUEST.nested_types = {}
BSEGUILDREQUEST.enum_types = {}
BSEGUILDREQUEST.fields = {BSEGUILDREQUEST_RESULT_FIELD, BSEGUILDREQUEST_GUILDID_FIELD, BSEGUILDREQUEST_GUILDNAME_FIELD}
BSEGUILDREQUEST.is_extendable = false
BSEGUILDREQUEST.extensions = {}

BseGuildRequest = protobuf.Message(BSEGUILDREQUEST)
_G.BSEGUILDREQUEST_PB_BSEGUILDREQUEST = BSEGUILDREQUEST

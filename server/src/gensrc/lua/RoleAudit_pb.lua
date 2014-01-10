-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('RoleAudit_pb', package.seeall)


local ROLEAUDIT = protobuf.Descriptor();
local ROLEAUDIT_SESSIONID_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_LEVEL_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_EXP_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_EXPDETA_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_MAXEXP_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_KILL_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_HIT_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_BATTLEMODE_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_ROOMTYPE_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_DAMAGE_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_CREDITDETA_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_HURTBLOOD_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_WINGAME_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_TOTALUSER_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_POWERDIFF_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_HITRATIO_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_KILLNUM_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_DROPNUM_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_PERFECT_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_SPY_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_SECONDKILL_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_ROUNDNUM_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_ACCURATENUM_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_REMARK_FIELD = protobuf.FieldDescriptor();
local ROLEAUDIT_ACTEXP_FIELD = protobuf.FieldDescriptor();

ROLEAUDIT_SESSIONID_FIELD.name = "sessionId"
ROLEAUDIT_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.sessionId"
ROLEAUDIT_SESSIONID_FIELD.number = 1
ROLEAUDIT_SESSIONID_FIELD.index = 0
ROLEAUDIT_SESSIONID_FIELD.label = 2
ROLEAUDIT_SESSIONID_FIELD.has_default_value = false
ROLEAUDIT_SESSIONID_FIELD.default_value = ""
ROLEAUDIT_SESSIONID_FIELD.type = 9
ROLEAUDIT_SESSIONID_FIELD.cpp_type = 9

ROLEAUDIT_LEVEL_FIELD.name = "level"
ROLEAUDIT_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.level"
ROLEAUDIT_LEVEL_FIELD.number = 2
ROLEAUDIT_LEVEL_FIELD.index = 1
ROLEAUDIT_LEVEL_FIELD.label = 2
ROLEAUDIT_LEVEL_FIELD.has_default_value = false
ROLEAUDIT_LEVEL_FIELD.default_value = 0
ROLEAUDIT_LEVEL_FIELD.type = 5
ROLEAUDIT_LEVEL_FIELD.cpp_type = 1

ROLEAUDIT_EXP_FIELD.name = "exp"
ROLEAUDIT_EXP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.exp"
ROLEAUDIT_EXP_FIELD.number = 3
ROLEAUDIT_EXP_FIELD.index = 2
ROLEAUDIT_EXP_FIELD.label = 2
ROLEAUDIT_EXP_FIELD.has_default_value = false
ROLEAUDIT_EXP_FIELD.default_value = 0
ROLEAUDIT_EXP_FIELD.type = 5
ROLEAUDIT_EXP_FIELD.cpp_type = 1

ROLEAUDIT_EXPDETA_FIELD.name = "expDeta"
ROLEAUDIT_EXPDETA_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.expDeta"
ROLEAUDIT_EXPDETA_FIELD.number = 4
ROLEAUDIT_EXPDETA_FIELD.index = 3
ROLEAUDIT_EXPDETA_FIELD.label = 2
ROLEAUDIT_EXPDETA_FIELD.has_default_value = false
ROLEAUDIT_EXPDETA_FIELD.default_value = 0
ROLEAUDIT_EXPDETA_FIELD.type = 5
ROLEAUDIT_EXPDETA_FIELD.cpp_type = 1

ROLEAUDIT_MAXEXP_FIELD.name = "maxExp"
ROLEAUDIT_MAXEXP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.maxExp"
ROLEAUDIT_MAXEXP_FIELD.number = 5
ROLEAUDIT_MAXEXP_FIELD.index = 4
ROLEAUDIT_MAXEXP_FIELD.label = 2
ROLEAUDIT_MAXEXP_FIELD.has_default_value = false
ROLEAUDIT_MAXEXP_FIELD.default_value = 0
ROLEAUDIT_MAXEXP_FIELD.type = 5
ROLEAUDIT_MAXEXP_FIELD.cpp_type = 1

ROLEAUDIT_KILL_FIELD.name = "kill"
ROLEAUDIT_KILL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.kill"
ROLEAUDIT_KILL_FIELD.number = 6
ROLEAUDIT_KILL_FIELD.index = 5
ROLEAUDIT_KILL_FIELD.label = 2
ROLEAUDIT_KILL_FIELD.has_default_value = false
ROLEAUDIT_KILL_FIELD.default_value = 0
ROLEAUDIT_KILL_FIELD.type = 5
ROLEAUDIT_KILL_FIELD.cpp_type = 1

ROLEAUDIT_HIT_FIELD.name = "hit"
ROLEAUDIT_HIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.hit"
ROLEAUDIT_HIT_FIELD.number = 7
ROLEAUDIT_HIT_FIELD.index = 6
ROLEAUDIT_HIT_FIELD.label = 2
ROLEAUDIT_HIT_FIELD.has_default_value = false
ROLEAUDIT_HIT_FIELD.default_value = 0
ROLEAUDIT_HIT_FIELD.type = 5
ROLEAUDIT_HIT_FIELD.cpp_type = 1

ROLEAUDIT_BATTLEMODE_FIELD.name = "battleMode"
ROLEAUDIT_BATTLEMODE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.battleMode"
ROLEAUDIT_BATTLEMODE_FIELD.number = 8
ROLEAUDIT_BATTLEMODE_FIELD.index = 7
ROLEAUDIT_BATTLEMODE_FIELD.label = 1
ROLEAUDIT_BATTLEMODE_FIELD.has_default_value = false
ROLEAUDIT_BATTLEMODE_FIELD.default_value = 0
ROLEAUDIT_BATTLEMODE_FIELD.type = 5
ROLEAUDIT_BATTLEMODE_FIELD.cpp_type = 1

ROLEAUDIT_ROOMTYPE_FIELD.name = "roomType"
ROLEAUDIT_ROOMTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.roomType"
ROLEAUDIT_ROOMTYPE_FIELD.number = 9
ROLEAUDIT_ROOMTYPE_FIELD.index = 8
ROLEAUDIT_ROOMTYPE_FIELD.label = 1
ROLEAUDIT_ROOMTYPE_FIELD.has_default_value = false
ROLEAUDIT_ROOMTYPE_FIELD.default_value = 0
ROLEAUDIT_ROOMTYPE_FIELD.type = 5
ROLEAUDIT_ROOMTYPE_FIELD.cpp_type = 1

ROLEAUDIT_DAMAGE_FIELD.name = "damage"
ROLEAUDIT_DAMAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.damage"
ROLEAUDIT_DAMAGE_FIELD.number = 10
ROLEAUDIT_DAMAGE_FIELD.index = 9
ROLEAUDIT_DAMAGE_FIELD.label = 1
ROLEAUDIT_DAMAGE_FIELD.has_default_value = false
ROLEAUDIT_DAMAGE_FIELD.default_value = 0
ROLEAUDIT_DAMAGE_FIELD.type = 5
ROLEAUDIT_DAMAGE_FIELD.cpp_type = 1

ROLEAUDIT_CREDITDETA_FIELD.name = "creditDeta"
ROLEAUDIT_CREDITDETA_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.creditDeta"
ROLEAUDIT_CREDITDETA_FIELD.number = 11
ROLEAUDIT_CREDITDETA_FIELD.index = 10
ROLEAUDIT_CREDITDETA_FIELD.label = 1
ROLEAUDIT_CREDITDETA_FIELD.has_default_value = false
ROLEAUDIT_CREDITDETA_FIELD.default_value = 0
ROLEAUDIT_CREDITDETA_FIELD.type = 5
ROLEAUDIT_CREDITDETA_FIELD.cpp_type = 1

ROLEAUDIT_HURTBLOOD_FIELD.name = "hurtBlood"
ROLEAUDIT_HURTBLOOD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.hurtBlood"
ROLEAUDIT_HURTBLOOD_FIELD.number = 12
ROLEAUDIT_HURTBLOOD_FIELD.index = 11
ROLEAUDIT_HURTBLOOD_FIELD.label = 1
ROLEAUDIT_HURTBLOOD_FIELD.has_default_value = false
ROLEAUDIT_HURTBLOOD_FIELD.default_value = 0
ROLEAUDIT_HURTBLOOD_FIELD.type = 5
ROLEAUDIT_HURTBLOOD_FIELD.cpp_type = 1

ROLEAUDIT_WINGAME_FIELD.name = "winGame"
ROLEAUDIT_WINGAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.winGame"
ROLEAUDIT_WINGAME_FIELD.number = 13
ROLEAUDIT_WINGAME_FIELD.index = 12
ROLEAUDIT_WINGAME_FIELD.label = 1
ROLEAUDIT_WINGAME_FIELD.has_default_value = false
ROLEAUDIT_WINGAME_FIELD.default_value = 0
ROLEAUDIT_WINGAME_FIELD.type = 5
ROLEAUDIT_WINGAME_FIELD.cpp_type = 1

ROLEAUDIT_TOTALUSER_FIELD.name = "totalUser"
ROLEAUDIT_TOTALUSER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.totalUser"
ROLEAUDIT_TOTALUSER_FIELD.number = 14
ROLEAUDIT_TOTALUSER_FIELD.index = 13
ROLEAUDIT_TOTALUSER_FIELD.label = 1
ROLEAUDIT_TOTALUSER_FIELD.has_default_value = false
ROLEAUDIT_TOTALUSER_FIELD.default_value = 0
ROLEAUDIT_TOTALUSER_FIELD.type = 5
ROLEAUDIT_TOTALUSER_FIELD.cpp_type = 1

ROLEAUDIT_POWERDIFF_FIELD.name = "powerDiff"
ROLEAUDIT_POWERDIFF_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.powerDiff"
ROLEAUDIT_POWERDIFF_FIELD.number = 15
ROLEAUDIT_POWERDIFF_FIELD.index = 14
ROLEAUDIT_POWERDIFF_FIELD.label = 1
ROLEAUDIT_POWERDIFF_FIELD.has_default_value = false
ROLEAUDIT_POWERDIFF_FIELD.default_value = 0
ROLEAUDIT_POWERDIFF_FIELD.type = 5
ROLEAUDIT_POWERDIFF_FIELD.cpp_type = 1

ROLEAUDIT_HITRATIO_FIELD.name = "hitRatio"
ROLEAUDIT_HITRATIO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.hitRatio"
ROLEAUDIT_HITRATIO_FIELD.number = 16
ROLEAUDIT_HITRATIO_FIELD.index = 15
ROLEAUDIT_HITRATIO_FIELD.label = 1
ROLEAUDIT_HITRATIO_FIELD.has_default_value = false
ROLEAUDIT_HITRATIO_FIELD.default_value = 0
ROLEAUDIT_HITRATIO_FIELD.type = 5
ROLEAUDIT_HITRATIO_FIELD.cpp_type = 1

ROLEAUDIT_KILLNUM_FIELD.name = "killNum"
ROLEAUDIT_KILLNUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.killNum"
ROLEAUDIT_KILLNUM_FIELD.number = 17
ROLEAUDIT_KILLNUM_FIELD.index = 16
ROLEAUDIT_KILLNUM_FIELD.label = 1
ROLEAUDIT_KILLNUM_FIELD.has_default_value = false
ROLEAUDIT_KILLNUM_FIELD.default_value = 0
ROLEAUDIT_KILLNUM_FIELD.type = 5
ROLEAUDIT_KILLNUM_FIELD.cpp_type = 1

ROLEAUDIT_DROPNUM_FIELD.name = "dropNum"
ROLEAUDIT_DROPNUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.dropNum"
ROLEAUDIT_DROPNUM_FIELD.number = 18
ROLEAUDIT_DROPNUM_FIELD.index = 17
ROLEAUDIT_DROPNUM_FIELD.label = 1
ROLEAUDIT_DROPNUM_FIELD.has_default_value = false
ROLEAUDIT_DROPNUM_FIELD.default_value = 0
ROLEAUDIT_DROPNUM_FIELD.type = 5
ROLEAUDIT_DROPNUM_FIELD.cpp_type = 1

ROLEAUDIT_PERFECT_FIELD.name = "perfect"
ROLEAUDIT_PERFECT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.perfect"
ROLEAUDIT_PERFECT_FIELD.number = 19
ROLEAUDIT_PERFECT_FIELD.index = 18
ROLEAUDIT_PERFECT_FIELD.label = 1
ROLEAUDIT_PERFECT_FIELD.has_default_value = false
ROLEAUDIT_PERFECT_FIELD.default_value = 0
ROLEAUDIT_PERFECT_FIELD.type = 5
ROLEAUDIT_PERFECT_FIELD.cpp_type = 1

ROLEAUDIT_SPY_FIELD.name = "spy"
ROLEAUDIT_SPY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.spy"
ROLEAUDIT_SPY_FIELD.number = 20
ROLEAUDIT_SPY_FIELD.index = 19
ROLEAUDIT_SPY_FIELD.label = 1
ROLEAUDIT_SPY_FIELD.has_default_value = false
ROLEAUDIT_SPY_FIELD.default_value = 0
ROLEAUDIT_SPY_FIELD.type = 5
ROLEAUDIT_SPY_FIELD.cpp_type = 1

ROLEAUDIT_SECONDKILL_FIELD.name = "secondKill"
ROLEAUDIT_SECONDKILL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.secondKill"
ROLEAUDIT_SECONDKILL_FIELD.number = 21
ROLEAUDIT_SECONDKILL_FIELD.index = 20
ROLEAUDIT_SECONDKILL_FIELD.label = 1
ROLEAUDIT_SECONDKILL_FIELD.has_default_value = false
ROLEAUDIT_SECONDKILL_FIELD.default_value = 0
ROLEAUDIT_SECONDKILL_FIELD.type = 5
ROLEAUDIT_SECONDKILL_FIELD.cpp_type = 1

ROLEAUDIT_ROUNDNUM_FIELD.name = "roundNum"
ROLEAUDIT_ROUNDNUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.roundNum"
ROLEAUDIT_ROUNDNUM_FIELD.number = 22
ROLEAUDIT_ROUNDNUM_FIELD.index = 21
ROLEAUDIT_ROUNDNUM_FIELD.label = 1
ROLEAUDIT_ROUNDNUM_FIELD.has_default_value = false
ROLEAUDIT_ROUNDNUM_FIELD.default_value = 0
ROLEAUDIT_ROUNDNUM_FIELD.type = 5
ROLEAUDIT_ROUNDNUM_FIELD.cpp_type = 1

ROLEAUDIT_ACCURATENUM_FIELD.name = "accurateNum"
ROLEAUDIT_ACCURATENUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.accurateNum"
ROLEAUDIT_ACCURATENUM_FIELD.number = 23
ROLEAUDIT_ACCURATENUM_FIELD.index = 22
ROLEAUDIT_ACCURATENUM_FIELD.label = 1
ROLEAUDIT_ACCURATENUM_FIELD.has_default_value = false
ROLEAUDIT_ACCURATENUM_FIELD.default_value = 0
ROLEAUDIT_ACCURATENUM_FIELD.type = 5
ROLEAUDIT_ACCURATENUM_FIELD.cpp_type = 1

ROLEAUDIT_REMARK_FIELD.name = "remark"
ROLEAUDIT_REMARK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.remark"
ROLEAUDIT_REMARK_FIELD.number = 24
ROLEAUDIT_REMARK_FIELD.index = 23
ROLEAUDIT_REMARK_FIELD.label = 1
ROLEAUDIT_REMARK_FIELD.has_default_value = false
ROLEAUDIT_REMARK_FIELD.default_value = ""
ROLEAUDIT_REMARK_FIELD.type = 9
ROLEAUDIT_REMARK_FIELD.cpp_type = 9

ROLEAUDIT_ACTEXP_FIELD.name = "actexp"
ROLEAUDIT_ACTEXP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit.actexp"
ROLEAUDIT_ACTEXP_FIELD.number = 25
ROLEAUDIT_ACTEXP_FIELD.index = 24
ROLEAUDIT_ACTEXP_FIELD.label = 1
ROLEAUDIT_ACTEXP_FIELD.has_default_value = false
ROLEAUDIT_ACTEXP_FIELD.default_value = 0
ROLEAUDIT_ACTEXP_FIELD.type = 5
ROLEAUDIT_ACTEXP_FIELD.cpp_type = 1

ROLEAUDIT.name = "RoleAudit"
ROLEAUDIT.full_name = ".com.xinqihd.sns.gameserver.proto.RoleAudit"
ROLEAUDIT.nested_types = {}
ROLEAUDIT.enum_types = {}
ROLEAUDIT.fields = {ROLEAUDIT_SESSIONID_FIELD, ROLEAUDIT_LEVEL_FIELD, ROLEAUDIT_EXP_FIELD, ROLEAUDIT_EXPDETA_FIELD, ROLEAUDIT_MAXEXP_FIELD, ROLEAUDIT_KILL_FIELD, ROLEAUDIT_HIT_FIELD, ROLEAUDIT_BATTLEMODE_FIELD, ROLEAUDIT_ROOMTYPE_FIELD, ROLEAUDIT_DAMAGE_FIELD, ROLEAUDIT_CREDITDETA_FIELD, ROLEAUDIT_HURTBLOOD_FIELD, ROLEAUDIT_WINGAME_FIELD, ROLEAUDIT_TOTALUSER_FIELD, ROLEAUDIT_POWERDIFF_FIELD, ROLEAUDIT_HITRATIO_FIELD, ROLEAUDIT_KILLNUM_FIELD, ROLEAUDIT_DROPNUM_FIELD, ROLEAUDIT_PERFECT_FIELD, ROLEAUDIT_SPY_FIELD, ROLEAUDIT_SECONDKILL_FIELD, ROLEAUDIT_ROUNDNUM_FIELD, ROLEAUDIT_ACCURATENUM_FIELD, ROLEAUDIT_REMARK_FIELD, ROLEAUDIT_ACTEXP_FIELD}
ROLEAUDIT.is_extendable = false
ROLEAUDIT.extensions = {}

RoleAudit = protobuf.Message(ROLEAUDIT)
_G.ROLEAUDIT_PB_ROLEAUDIT = ROLEAUDIT

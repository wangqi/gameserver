// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseOnlineReward.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseOnlineReward {
  private XinqiBseOnlineReward() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseOnlineRewardOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string id = 1;
    boolean hasId();
    String getId();
    
    // optional int32 stepID = 2;
    boolean hasStepID();
    int getStepID();
    
    // optional int32 remainTime = 3;
    boolean hasRemainTime();
    int getRemainTime();
    
    // repeated int32 propID = 4;
    java.util.List<java.lang.Integer> getPropIDList();
    int getPropIDCount();
    int getPropID(int index);
    
    // repeated int32 propLevel = 5;
    java.util.List<java.lang.Integer> getPropLevelList();
    int getPropLevelCount();
    int getPropLevel(int index);
    
    // repeated int32 propCount = 6;
    java.util.List<java.lang.Integer> getPropCountList();
    int getPropCountCount();
    int getPropCount(int index);
    
    // optional int32 type = 7 [default = 0];
    boolean hasType();
    int getType();
    
    // optional bool watchonly = 8 [default = false];
    boolean hasWatchonly();
    boolean getWatchonly();
  }
  public static final class BseOnlineReward extends
      com.google.protobuf.GeneratedMessage
      implements BseOnlineRewardOrBuilder {
    // Use BseOnlineReward.newBuilder() to construct.
    private BseOnlineReward(Builder builder) {
      super(builder);
    }
    private BseOnlineReward(boolean noInit) {}
    
    private static final BseOnlineReward defaultInstance;
    public static BseOnlineReward getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseOnlineReward getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 stepID = 2;
    public static final int STEPID_FIELD_NUMBER = 2;
    private int stepID_;
    public boolean hasStepID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getStepID() {
      return stepID_;
    }
    
    // optional int32 remainTime = 3;
    public static final int REMAINTIME_FIELD_NUMBER = 3;
    private int remainTime_;
    public boolean hasRemainTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getRemainTime() {
      return remainTime_;
    }
    
    // repeated int32 propID = 4;
    public static final int PROPID_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> propID_;
    public java.util.List<java.lang.Integer>
        getPropIDList() {
      return propID_;
    }
    public int getPropIDCount() {
      return propID_.size();
    }
    public int getPropID(int index) {
      return propID_.get(index);
    }
    
    // repeated int32 propLevel = 5;
    public static final int PROPLEVEL_FIELD_NUMBER = 5;
    private java.util.List<java.lang.Integer> propLevel_;
    public java.util.List<java.lang.Integer>
        getPropLevelList() {
      return propLevel_;
    }
    public int getPropLevelCount() {
      return propLevel_.size();
    }
    public int getPropLevel(int index) {
      return propLevel_.get(index);
    }
    
    // repeated int32 propCount = 6;
    public static final int PROPCOUNT_FIELD_NUMBER = 6;
    private java.util.List<java.lang.Integer> propCount_;
    public java.util.List<java.lang.Integer>
        getPropCountList() {
      return propCount_;
    }
    public int getPropCountCount() {
      return propCount_.size();
    }
    public int getPropCount(int index) {
      return propCount_.get(index);
    }
    
    // optional int32 type = 7 [default = 0];
    public static final int TYPE_FIELD_NUMBER = 7;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getType() {
      return type_;
    }
    
    // optional bool watchonly = 8 [default = false];
    public static final int WATCHONLY_FIELD_NUMBER = 8;
    private boolean watchonly_;
    public boolean hasWatchonly() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public boolean getWatchonly() {
      return watchonly_;
    }
    
    private void initFields() {
      id_ = "";
      stepID_ = 0;
      remainTime_ = 0;
      propID_ = java.util.Collections.emptyList();;
      propLevel_ = java.util.Collections.emptyList();;
      propCount_ = java.util.Collections.emptyList();;
      type_ = 0;
      watchonly_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, stepID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, remainTime_);
      }
      for (int i = 0; i < propID_.size(); i++) {
        output.writeInt32(4, propID_.get(i));
      }
      for (int i = 0; i < propLevel_.size(); i++) {
        output.writeInt32(5, propLevel_.get(i));
      }
      for (int i = 0; i < propCount_.size(); i++) {
        output.writeInt32(6, propCount_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(7, type_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(8, watchonly_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, stepID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, remainTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < propID_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(propID_.get(i));
        }
        size += dataSize;
        size += 1 * getPropIDList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < propLevel_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(propLevel_.get(i));
        }
        size += dataSize;
        size += 1 * getPropLevelList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < propCount_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(propCount_.get(i));
        }
        size += dataSize;
        size += 1 * getPropCountList().size();
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, type_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, watchonly_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        stepID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        remainTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        propID_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000008);
        propLevel_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000010);
        propCount_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000020);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        watchonly_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward result = new com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.stepID_ = stepID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.remainTime_ = remainTime_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          propID_ = java.util.Collections.unmodifiableList(propID_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.propID_ = propID_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          propLevel_ = java.util.Collections.unmodifiableList(propLevel_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.propLevel_ = propLevel_;
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          propCount_ = java.util.Collections.unmodifiableList(propCount_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.propCount_ = propCount_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000008;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000010;
        }
        result.watchonly_ = watchonly_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasStepID()) {
          setStepID(other.getStepID());
        }
        if (other.hasRemainTime()) {
          setRemainTime(other.getRemainTime());
        }
        if (!other.propID_.isEmpty()) {
          if (propID_.isEmpty()) {
            propID_ = other.propID_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensurePropIDIsMutable();
            propID_.addAll(other.propID_);
          }
          onChanged();
        }
        if (!other.propLevel_.isEmpty()) {
          if (propLevel_.isEmpty()) {
            propLevel_ = other.propLevel_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensurePropLevelIsMutable();
            propLevel_.addAll(other.propLevel_);
          }
          onChanged();
        }
        if (!other.propCount_.isEmpty()) {
          if (propCount_.isEmpty()) {
            propCount_ = other.propCount_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensurePropCountIsMutable();
            propCount_.addAll(other.propCount_);
          }
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasWatchonly()) {
          setWatchonly(other.getWatchonly());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              stepID_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              remainTime_ = input.readInt32();
              break;
            }
            case 32: {
              ensurePropIDIsMutable();
              propID_.add(input.readInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addPropID(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {
              ensurePropLevelIsMutable();
              propLevel_.add(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addPropLevel(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {
              ensurePropCountIsMutable();
              propCount_.add(input.readInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addPropCount(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              type_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              watchonly_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string id = 1;
      private java.lang.Object id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
      }
      
      // optional int32 stepID = 2;
      private int stepID_ ;
      public boolean hasStepID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getStepID() {
        return stepID_;
      }
      public Builder setStepID(int value) {
        bitField0_ |= 0x00000002;
        stepID_ = value;
        onChanged();
        return this;
      }
      public Builder clearStepID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stepID_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 remainTime = 3;
      private int remainTime_ ;
      public boolean hasRemainTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getRemainTime() {
        return remainTime_;
      }
      public Builder setRemainTime(int value) {
        bitField0_ |= 0x00000004;
        remainTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearRemainTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        remainTime_ = 0;
        onChanged();
        return this;
      }
      
      // repeated int32 propID = 4;
      private java.util.List<java.lang.Integer> propID_ = java.util.Collections.emptyList();;
      private void ensurePropIDIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          propID_ = new java.util.ArrayList<java.lang.Integer>(propID_);
          bitField0_ |= 0x00000008;
         }
      }
      public java.util.List<java.lang.Integer>
          getPropIDList() {
        return java.util.Collections.unmodifiableList(propID_);
      }
      public int getPropIDCount() {
        return propID_.size();
      }
      public int getPropID(int index) {
        return propID_.get(index);
      }
      public Builder setPropID(
          int index, int value) {
        ensurePropIDIsMutable();
        propID_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addPropID(int value) {
        ensurePropIDIsMutable();
        propID_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllPropID(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePropIDIsMutable();
        super.addAll(values, propID_);
        onChanged();
        return this;
      }
      public Builder clearPropID() {
        propID_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      
      // repeated int32 propLevel = 5;
      private java.util.List<java.lang.Integer> propLevel_ = java.util.Collections.emptyList();;
      private void ensurePropLevelIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          propLevel_ = new java.util.ArrayList<java.lang.Integer>(propLevel_);
          bitField0_ |= 0x00000010;
         }
      }
      public java.util.List<java.lang.Integer>
          getPropLevelList() {
        return java.util.Collections.unmodifiableList(propLevel_);
      }
      public int getPropLevelCount() {
        return propLevel_.size();
      }
      public int getPropLevel(int index) {
        return propLevel_.get(index);
      }
      public Builder setPropLevel(
          int index, int value) {
        ensurePropLevelIsMutable();
        propLevel_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addPropLevel(int value) {
        ensurePropLevelIsMutable();
        propLevel_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllPropLevel(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePropLevelIsMutable();
        super.addAll(values, propLevel_);
        onChanged();
        return this;
      }
      public Builder clearPropLevel() {
        propLevel_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      
      // repeated int32 propCount = 6;
      private java.util.List<java.lang.Integer> propCount_ = java.util.Collections.emptyList();;
      private void ensurePropCountIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          propCount_ = new java.util.ArrayList<java.lang.Integer>(propCount_);
          bitField0_ |= 0x00000020;
         }
      }
      public java.util.List<java.lang.Integer>
          getPropCountList() {
        return java.util.Collections.unmodifiableList(propCount_);
      }
      public int getPropCountCount() {
        return propCount_.size();
      }
      public int getPropCount(int index) {
        return propCount_.get(index);
      }
      public Builder setPropCount(
          int index, int value) {
        ensurePropCountIsMutable();
        propCount_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addPropCount(int value) {
        ensurePropCountIsMutable();
        propCount_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllPropCount(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePropCountIsMutable();
        super.addAll(values, propCount_);
        onChanged();
        return this;
      }
      public Builder clearPropCount() {
        propCount_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }
      
      // optional int32 type = 7 [default = 0];
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000040;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000040);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // optional bool watchonly = 8 [default = false];
      private boolean watchonly_ ;
      public boolean hasWatchonly() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public boolean getWatchonly() {
        return watchonly_;
      }
      public Builder setWatchonly(boolean value) {
        bitField0_ |= 0x00000080;
        watchonly_ = value;
        onChanged();
        return this;
      }
      public Builder clearWatchonly() {
        bitField0_ = (bitField0_ & ~0x00000080);
        watchonly_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseOnlineReward)
    }
    
    static {
      defaultInstance = new BseOnlineReward(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseOnlineReward)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BseOnlineReward.proto\022 com.xinqihd.sns" +
      ".gameserver.proto\"\242\001\n\017BseOnlineReward\022\n\n" +
      "\002id\030\001 \001(\t\022\016\n\006stepID\030\002 \001(\005\022\022\n\nremainTime\030" +
      "\003 \001(\005\022\016\n\006propID\030\004 \003(\005\022\021\n\tpropLevel\030\005 \003(\005" +
      "\022\021\n\tpropCount\030\006 \003(\005\022\017\n\004type\030\007 \001(\005:\0010\022\030\n\t" +
      "watchonly\030\010 \001(\010:\005falseB\026B\024XinqiBseOnline" +
      "Reward"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineReward_descriptor,
              new java.lang.String[] { "Id", "StepID", "RemainTime", "PropID", "PropLevel", "PropCount", "Type", "Watchonly", },
              com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseOnlineReward.BseOnlineReward.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
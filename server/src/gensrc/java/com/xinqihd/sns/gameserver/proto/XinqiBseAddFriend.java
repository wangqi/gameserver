// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseAddFriend.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseAddFriend {
  private XinqiBseAddFriend() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseAddFriendOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string username = 1;
    boolean hasUsername();
    String getUsername();
    
    // optional bool blacklist = 2 [default = false];
    boolean hasBlacklist();
    boolean getBlacklist();
    
    // optional bool succ = 3 [default = false];
    boolean hasSucc();
    boolean getSucc();
    
    // optional bool isdel = 4 [default = false];
    boolean hasIsdel();
    boolean getIsdel();
  }
  public static final class BseAddFriend extends
      com.google.protobuf.GeneratedMessage
      implements BseAddFriendOrBuilder {
    // Use BseAddFriend.newBuilder() to construct.
    private BseAddFriend(Builder builder) {
      super(builder);
    }
    private BseAddFriend(boolean noInit) {}
    
    private static final BseAddFriend defaultInstance;
    public static BseAddFriend getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseAddFriend getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string username = 1;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private java.lang.Object username_;
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          username_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool blacklist = 2 [default = false];
    public static final int BLACKLIST_FIELD_NUMBER = 2;
    private boolean blacklist_;
    public boolean hasBlacklist() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getBlacklist() {
      return blacklist_;
    }
    
    // optional bool succ = 3 [default = false];
    public static final int SUCC_FIELD_NUMBER = 3;
    private boolean succ_;
    public boolean hasSucc() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getSucc() {
      return succ_;
    }
    
    // optional bool isdel = 4 [default = false];
    public static final int ISDEL_FIELD_NUMBER = 4;
    private boolean isdel_;
    public boolean hasIsdel() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public boolean getIsdel() {
      return isdel_;
    }
    
    private void initFields() {
      username_ = "";
      blacklist_ = false;
      succ_ = false;
      isdel_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUsername()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, blacklist_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, succ_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, isdel_);
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
          .computeBytesSize(1, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, blacklist_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, succ_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isdel_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriendOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend.newBuilder()
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
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        blacklist_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        succ_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        isdel_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend result = new com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.blacklist_ = blacklist_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.succ_ = succ_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.isdel_ = isdel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend.getDefaultInstance()) return this;
        if (other.hasUsername()) {
          setUsername(other.getUsername());
        }
        if (other.hasBlacklist()) {
          setBlacklist(other.getBlacklist());
        }
        if (other.hasSucc()) {
          setSucc(other.getSucc());
        }
        if (other.hasIsdel()) {
          setIsdel(other.getIsdel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUsername()) {
          
          return false;
        }
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
              username_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              blacklist_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              succ_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              isdel_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string username = 1;
      private java.lang.Object username_ = "";
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUsername(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000001);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      void setUsername(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
      }
      
      // optional bool blacklist = 2 [default = false];
      private boolean blacklist_ ;
      public boolean hasBlacklist() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getBlacklist() {
        return blacklist_;
      }
      public Builder setBlacklist(boolean value) {
        bitField0_ |= 0x00000002;
        blacklist_ = value;
        onChanged();
        return this;
      }
      public Builder clearBlacklist() {
        bitField0_ = (bitField0_ & ~0x00000002);
        blacklist_ = false;
        onChanged();
        return this;
      }
      
      // optional bool succ = 3 [default = false];
      private boolean succ_ ;
      public boolean hasSucc() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getSucc() {
        return succ_;
      }
      public Builder setSucc(boolean value) {
        bitField0_ |= 0x00000004;
        succ_ = value;
        onChanged();
        return this;
      }
      public Builder clearSucc() {
        bitField0_ = (bitField0_ & ~0x00000004);
        succ_ = false;
        onChanged();
        return this;
      }
      
      // optional bool isdel = 4 [default = false];
      private boolean isdel_ ;
      public boolean hasIsdel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public boolean getIsdel() {
        return isdel_;
      }
      public Builder setIsdel(boolean value) {
        bitField0_ |= 0x00000008;
        isdel_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsdel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isdel_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseAddFriend)
    }
    
    static {
      defaultInstance = new BseAddFriend(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseAddFriend)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BseAddFriend.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\"e\n\014BseAddFriend\022\020\n\010userna" +
      "me\030\001 \002(\t\022\030\n\tblacklist\030\002 \001(\010:\005false\022\023\n\004su" +
      "cc\030\003 \001(\010:\005false\022\024\n\005isdel\030\004 \001(\010:\005falseB\023B" +
      "\021XinqiBseAddFriend"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseAddFriend_descriptor,
              new java.lang.String[] { "Username", "Blacklist", "Succ", "Isdel", },
              com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseAddFriend.BseAddFriend.Builder.class);
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

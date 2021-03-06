// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceGuildContributeQuery.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceGuildContributeQuery {
  private XinqiBceGuildContributeQuery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceGuildContributeQueryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string guildID = 1;
    boolean hasGuildID();
    String getGuildID();
    
    // optional uint32 yuanbao = 2;
    boolean hasYuanbao();
    int getYuanbao();
    
    // optional uint32 golden = 3;
    boolean hasGolden();
    int getGolden();
  }
  public static final class BceGuildContributeQuery extends
      com.google.protobuf.GeneratedMessage
      implements BceGuildContributeQueryOrBuilder {
    // Use BceGuildContributeQuery.newBuilder() to construct.
    private BceGuildContributeQuery(Builder builder) {
      super(builder);
    }
    private BceGuildContributeQuery(boolean noInit) {}
    
    private static final BceGuildContributeQuery defaultInstance;
    public static BceGuildContributeQuery getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceGuildContributeQuery getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string guildID = 1;
    public static final int GUILDID_FIELD_NUMBER = 1;
    private java.lang.Object guildID_;
    public boolean hasGuildID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getGuildID() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          guildID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGuildIDBytes() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        guildID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional uint32 yuanbao = 2;
    public static final int YUANBAO_FIELD_NUMBER = 2;
    private int yuanbao_;
    public boolean hasYuanbao() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getYuanbao() {
      return yuanbao_;
    }
    
    // optional uint32 golden = 3;
    public static final int GOLDEN_FIELD_NUMBER = 3;
    private int golden_;
    public boolean hasGolden() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getGolden() {
      return golden_;
    }
    
    private void initFields() {
      guildID_ = "";
      yuanbao_ = 0;
      golden_ = 0;
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
        output.writeBytes(1, getGuildIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, yuanbao_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, golden_);
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
          .computeBytesSize(1, getGuildIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, yuanbao_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, golden_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery.newBuilder()
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
        guildID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        yuanbao_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        golden_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery result = new com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guildID_ = guildID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.yuanbao_ = yuanbao_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.golden_ = golden_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery.getDefaultInstance()) return this;
        if (other.hasGuildID()) {
          setGuildID(other.getGuildID());
        }
        if (other.hasYuanbao()) {
          setYuanbao(other.getYuanbao());
        }
        if (other.hasGolden()) {
          setGolden(other.getGolden());
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
              guildID_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              yuanbao_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              golden_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string guildID = 1;
      private java.lang.Object guildID_ = "";
      public boolean hasGuildID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getGuildID() {
        java.lang.Object ref = guildID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          guildID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGuildID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guildID_ = getDefaultInstance().getGuildID();
        onChanged();
        return this;
      }
      void setGuildID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
      }
      
      // optional uint32 yuanbao = 2;
      private int yuanbao_ ;
      public boolean hasYuanbao() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getYuanbao() {
        return yuanbao_;
      }
      public Builder setYuanbao(int value) {
        bitField0_ |= 0x00000002;
        yuanbao_ = value;
        onChanged();
        return this;
      }
      public Builder clearYuanbao() {
        bitField0_ = (bitField0_ & ~0x00000002);
        yuanbao_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 golden = 3;
      private int golden_ ;
      public boolean hasGolden() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getGolden() {
        return golden_;
      }
      public Builder setGolden(int value) {
        bitField0_ |= 0x00000004;
        golden_ = value;
        onChanged();
        return this;
      }
      public Builder clearGolden() {
        bitField0_ = (bitField0_ & ~0x00000004);
        golden_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceGuildContributeQuery)
    }
    
    static {
      defaultInstance = new BceGuildContributeQuery(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceGuildContributeQuery)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035BceGuildContributeQuery.proto\022 com.xin" +
      "qihd.sns.gameserver.proto\"K\n\027BceGuildCon" +
      "tributeQuery\022\017\n\007guildID\030\001 \001(\t\022\017\n\007yuanbao" +
      "\030\002 \001(\r\022\016\n\006golden\030\003 \001(\rB\036B\034XinqiBceGuildC" +
      "ontributeQuery"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceGuildContributeQuery_descriptor,
              new java.lang.String[] { "GuildID", "Yuanbao", "Golden", },
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildContributeQuery.BceGuildContributeQuery.Builder.class);
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Update_profile.proto

package com.stackroute.musicmantra.noty5.emailserver.update_profile;

public final class UpdateProfile {
  private UpdateProfile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mailRequesttoUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mailRequesttoUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_updateProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_updateProfileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024Update_profile.proto\"%\n\023mailRequesttoU" +
      "pdate\022\016\n\006userId\030\001 \001(\005\">\n\025updateProfileRe" +
      "sponse\022\017\n\007message\030\001 \001(\t\022\024\n\014Responsecode\030" +
      "\002 \001(\0052Y\n\030UpdateProfileEmailServer\022=\n\rpro" +
      "fileUpdate\022\024.mailRequesttoUpdate\032\026.updat" +
      "eProfileResponseB?\n;com.stackroute.music" +
      "mantra.noty5.emailserver.update_profileP" +
      "\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_mailRequesttoUpdate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mailRequesttoUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mailRequesttoUpdate_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_updateProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_updateProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_updateProfileResponse_descriptor,
        new java.lang.String[] { "Message", "Responsecode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

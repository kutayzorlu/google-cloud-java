// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/document.proto

package com.google.firestore.v1beta1;

public final class DocumentProto {
  private DocumentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_Document_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Document_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_ArrayValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_ArrayValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_MapValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_MapValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_MapValue_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_MapValue_FieldsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/firestore/v1beta1/document.prot" +
      "o\022\030google.firestore.v1beta1\032\034google/api/" +
      "annotations.proto\032\034google/protobuf/struc" +
      "t.proto\032\037google/protobuf/timestamp.proto" +
      "\032\030google/type/latlng.proto\"\212\002\n\010Document\022" +
      "\014\n\004name\030\001 \001(\t\022>\n\006fields\030\002 \003(\0132..google.f" +
      "irestore.v1beta1.Document.FieldsEntry\022/\n" +
      "\013create_time\030\003 \001(\0132\032.google.protobuf.Tim" +
      "estamp\022/\n\013update_time\030\004 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\032N\n\013FieldsEntry\022\013\n\003key\030\001 ",
      "\001(\t\022.\n\005value\030\002 \001(\0132\037.google.firestore.v1" +
      "beta1.Value:\0028\001\"\270\003\n\005Value\0220\n\nnull_value\030" +
      "\013 \001(\0162\032.google.protobuf.NullValueH\000\022\027\n\rb" +
      "oolean_value\030\001 \001(\010H\000\022\027\n\rinteger_value\030\002 " +
      "\001(\003H\000\022\026\n\014double_value\030\003 \001(\001H\000\0225\n\017timesta" +
      "mp_value\030\n \001(\0132\032.google.protobuf.Timesta" +
      "mpH\000\022\026\n\014string_value\030\021 \001(\tH\000\022\025\n\013bytes_va" +
      "lue\030\022 \001(\014H\000\022\031\n\017reference_value\030\005 \001(\tH\000\022." +
      "\n\017geo_point_value\030\010 \001(\0132\023.google.type.La" +
      "tLngH\000\022;\n\013array_value\030\t \001(\0132$.google.fir",
      "estore.v1beta1.ArrayValueH\000\0227\n\tmap_value" +
      "\030\006 \001(\0132\".google.firestore.v1beta1.MapVal" +
      "ueH\000B\014\n\nvalue_type\"=\n\nArrayValue\022/\n\006valu" +
      "es\030\001 \003(\0132\037.google.firestore.v1beta1.Valu" +
      "e\"\232\001\n\010MapValue\022>\n\006fields\030\001 \003(\0132..google." +
      "firestore.v1beta1.MapValue.FieldsEntry\032N" +
      "\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022.\n\005value\030\002 \001(" +
      "\0132\037.google.firestore.v1beta1.Value:\0028\001B\273" +
      "\001\n\034com.google.firestore.v1beta1B\rDocumen" +
      "tProtoP\001ZAgoogle.golang.org/genproto/goo",
      "gleapis/firestore/v1beta1;firestore\242\002\004GC" +
      "FS\252\002\036Google.Cloud.Firestore.V1Beta1\312\002\036Go" +
      "ogle\\Cloud\\Firestore\\V1beta1b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
        }, assigner);
    internal_static_google_firestore_v1beta1_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1beta1_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_Document_descriptor,
        new java.lang.String[] { "Name", "Fields", "CreateTime", "UpdateTime", });
    internal_static_google_firestore_v1beta1_Document_FieldsEntry_descriptor =
      internal_static_google_firestore_v1beta1_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1beta1_Document_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_Document_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_firestore_v1beta1_Value_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1beta1_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_Value_descriptor,
        new java.lang.String[] { "NullValue", "BooleanValue", "IntegerValue", "DoubleValue", "TimestampValue", "StringValue", "BytesValue", "ReferenceValue", "GeoPointValue", "ArrayValue", "MapValue", "ValueType", });
    internal_static_google_firestore_v1beta1_ArrayValue_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1beta1_ArrayValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_ArrayValue_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_google_firestore_v1beta1_MapValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_v1beta1_MapValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_MapValue_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_google_firestore_v1beta1_MapValue_FieldsEntry_descriptor =
      internal_static_google_firestore_v1beta1_MapValue_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1beta1_MapValue_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_MapValue_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
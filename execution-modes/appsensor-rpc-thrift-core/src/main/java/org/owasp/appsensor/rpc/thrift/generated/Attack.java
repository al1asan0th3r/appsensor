/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.owasp.appsensor.rpc.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Attack implements org.apache.thrift.TBase<Attack, Attack._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Attack");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DETECTION_POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("detectionPoint", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DETECTION_SYSTEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("detectionSystemId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField RESOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("resource", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AttackStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AttackTupleSchemeFactory());
  }

  public int id; // required
  public User user; // required
  public DetectionPoint detectionPoint; // required
  public String timestamp; // required
  public String detectionSystemId; // required
  public Resource resource; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    USER((short)2, "user"),
    DETECTION_POINT((short)3, "detectionPoint"),
    TIMESTAMP((short)4, "timestamp"),
    DETECTION_SYSTEM_ID((short)5, "detectionSystemId"),
    RESOURCE((short)6, "resource");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // USER
          return USER;
        case 3: // DETECTION_POINT
          return DETECTION_POINT;
        case 4: // TIMESTAMP
          return TIMESTAMP;
        case 5: // DETECTION_SYSTEM_ID
          return DETECTION_SYSTEM_ID;
        case 6: // RESOURCE
          return RESOURCE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, User.class)));
    tmpMap.put(_Fields.DETECTION_POINT, new org.apache.thrift.meta_data.FieldMetaData("detectionPoint", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DetectionPoint.class)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETECTION_SYSTEM_ID, new org.apache.thrift.meta_data.FieldMetaData("detectionSystemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE, new org.apache.thrift.meta_data.FieldMetaData("resource", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Resource.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Attack.class, metaDataMap);
  }

  public Attack() {
  }

  public Attack(
    int id,
    User user,
    DetectionPoint detectionPoint,
    String timestamp,
    String detectionSystemId,
    Resource resource)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.user = user;
    this.detectionPoint = detectionPoint;
    this.timestamp = timestamp;
    this.detectionSystemId = detectionSystemId;
    this.resource = resource;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Attack(Attack other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetUser()) {
      this.user = new User(other.user);
    }
    if (other.isSetDetectionPoint()) {
      this.detectionPoint = new DetectionPoint(other.detectionPoint);
    }
    if (other.isSetTimestamp()) {
      this.timestamp = other.timestamp;
    }
    if (other.isSetDetectionSystemId()) {
      this.detectionSystemId = other.detectionSystemId;
    }
    if (other.isSetResource()) {
      this.resource = new Resource(other.resource);
    }
  }

  public Attack deepCopy() {
    return new Attack(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.user = null;
    this.detectionPoint = null;
    this.timestamp = null;
    this.detectionSystemId = null;
    this.resource = null;
  }

  public int getId() {
    return this.id;
  }

  public Attack setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public User getUser() {
    return this.user;
  }

  public Attack setUser(User user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public DetectionPoint getDetectionPoint() {
    return this.detectionPoint;
  }

  public Attack setDetectionPoint(DetectionPoint detectionPoint) {
    this.detectionPoint = detectionPoint;
    return this;
  }

  public void unsetDetectionPoint() {
    this.detectionPoint = null;
  }

  /** Returns true if field detectionPoint is set (has been assigned a value) and false otherwise */
  public boolean isSetDetectionPoint() {
    return this.detectionPoint != null;
  }

  public void setDetectionPointIsSet(boolean value) {
    if (!value) {
      this.detectionPoint = null;
    }
  }

  public String getTimestamp() {
    return this.timestamp;
  }

  public Attack setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public void unsetTimestamp() {
    this.timestamp = null;
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return this.timestamp != null;
  }

  public void setTimestampIsSet(boolean value) {
    if (!value) {
      this.timestamp = null;
    }
  }

  public String getDetectionSystemId() {
    return this.detectionSystemId;
  }

  public Attack setDetectionSystemId(String detectionSystemId) {
    this.detectionSystemId = detectionSystemId;
    return this;
  }

  public void unsetDetectionSystemId() {
    this.detectionSystemId = null;
  }

  /** Returns true if field detectionSystemId is set (has been assigned a value) and false otherwise */
  public boolean isSetDetectionSystemId() {
    return this.detectionSystemId != null;
  }

  public void setDetectionSystemIdIsSet(boolean value) {
    if (!value) {
      this.detectionSystemId = null;
    }
  }

  public Resource getResource() {
    return this.resource;
  }

  public Attack setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  public void unsetResource() {
    this.resource = null;
  }

  /** Returns true if field resource is set (has been assigned a value) and false otherwise */
  public boolean isSetResource() {
    return this.resource != null;
  }

  public void setResourceIsSet(boolean value) {
    if (!value) {
      this.resource = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((User)value);
      }
      break;

    case DETECTION_POINT:
      if (value == null) {
        unsetDetectionPoint();
      } else {
        setDetectionPoint((DetectionPoint)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((String)value);
      }
      break;

    case DETECTION_SYSTEM_ID:
      if (value == null) {
        unsetDetectionSystemId();
      } else {
        setDetectionSystemId((String)value);
      }
      break;

    case RESOURCE:
      if (value == null) {
        unsetResource();
      } else {
        setResource((Resource)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case USER:
      return getUser();

    case DETECTION_POINT:
      return getDetectionPoint();

    case TIMESTAMP:
      return getTimestamp();

    case DETECTION_SYSTEM_ID:
      return getDetectionSystemId();

    case RESOURCE:
      return getResource();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case USER:
      return isSetUser();
    case DETECTION_POINT:
      return isSetDetectionPoint();
    case TIMESTAMP:
      return isSetTimestamp();
    case DETECTION_SYSTEM_ID:
      return isSetDetectionSystemId();
    case RESOURCE:
      return isSetResource();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Attack)
      return this.equals((Attack)that);
    return false;
  }

  public boolean equals(Attack that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_detectionPoint = true && this.isSetDetectionPoint();
    boolean that_present_detectionPoint = true && that.isSetDetectionPoint();
    if (this_present_detectionPoint || that_present_detectionPoint) {
      if (!(this_present_detectionPoint && that_present_detectionPoint))
        return false;
      if (!this.detectionPoint.equals(that.detectionPoint))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (!this.timestamp.equals(that.timestamp))
        return false;
    }

    boolean this_present_detectionSystemId = true && this.isSetDetectionSystemId();
    boolean that_present_detectionSystemId = true && that.isSetDetectionSystemId();
    if (this_present_detectionSystemId || that_present_detectionSystemId) {
      if (!(this_present_detectionSystemId && that_present_detectionSystemId))
        return false;
      if (!this.detectionSystemId.equals(that.detectionSystemId))
        return false;
    }

    boolean this_present_resource = true && this.isSetResource();
    boolean that_present_resource = true && that.isSetResource();
    if (this_present_resource || that_present_resource) {
      if (!(this_present_resource && that_present_resource))
        return false;
      if (!this.resource.equals(that.resource))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Attack other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Attack typedOther = (Attack)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(typedOther.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, typedOther.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetectionPoint()).compareTo(typedOther.isSetDetectionPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetectionPoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.detectionPoint, typedOther.detectionPoint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetectionSystemId()).compareTo(typedOther.isSetDetectionSystemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetectionSystemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.detectionSystemId, typedOther.detectionSystemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResource()).compareTo(typedOther.isSetResource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource, typedOther.resource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Attack(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("detectionPoint:");
    if (this.detectionPoint == null) {
      sb.append("null");
    } else {
      sb.append(this.detectionPoint);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    if (this.timestamp == null) {
      sb.append("null");
    } else {
      sb.append(this.timestamp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("detectionSystemId:");
    if (this.detectionSystemId == null) {
      sb.append("null");
    } else {
      sb.append(this.detectionSystemId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resource:");
    if (this.resource == null) {
      sb.append("null");
    } else {
      sb.append(this.resource);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (user != null) {
      user.validate();
    }
    if (detectionPoint != null) {
      detectionPoint.validate();
    }
    if (resource != null) {
      resource.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AttackStandardSchemeFactory implements SchemeFactory {
    public AttackStandardScheme getScheme() {
      return new AttackStandardScheme();
    }
  }

  private static class AttackStandardScheme extends StandardScheme<Attack> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Attack struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.user = new User();
              struct.user.read(iprot);
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DETECTION_POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.detectionPoint = new DetectionPoint();
              struct.detectionPoint.read(iprot);
              struct.setDetectionPointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timestamp = iprot.readString();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DETECTION_SYSTEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.detectionSystemId = iprot.readString();
              struct.setDetectionSystemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RESOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resource = new Resource();
              struct.resource.read(iprot);
              struct.setResourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Attack struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        struct.user.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.detectionPoint != null) {
        oprot.writeFieldBegin(DETECTION_POINT_FIELD_DESC);
        struct.detectionPoint.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.timestamp != null) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeString(struct.timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.detectionSystemId != null) {
        oprot.writeFieldBegin(DETECTION_SYSTEM_ID_FIELD_DESC);
        oprot.writeString(struct.detectionSystemId);
        oprot.writeFieldEnd();
      }
      if (struct.resource != null) {
        oprot.writeFieldBegin(RESOURCE_FIELD_DESC);
        struct.resource.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AttackTupleSchemeFactory implements SchemeFactory {
    public AttackTupleScheme getScheme() {
      return new AttackTupleScheme();
    }
  }

  private static class AttackTupleScheme extends TupleScheme<Attack> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Attack struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetUser()) {
        optionals.set(1);
      }
      if (struct.isSetDetectionPoint()) {
        optionals.set(2);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(3);
      }
      if (struct.isSetDetectionSystemId()) {
        optionals.set(4);
      }
      if (struct.isSetResource()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetUser()) {
        struct.user.write(oprot);
      }
      if (struct.isSetDetectionPoint()) {
        struct.detectionPoint.write(oprot);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeString(struct.timestamp);
      }
      if (struct.isSetDetectionSystemId()) {
        oprot.writeString(struct.detectionSystemId);
      }
      if (struct.isSetResource()) {
        struct.resource.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Attack struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user = new User();
        struct.user.read(iprot);
        struct.setUserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.detectionPoint = new DetectionPoint();
        struct.detectionPoint.read(iprot);
        struct.setDetectionPointIsSet(true);
      }
      if (incoming.get(3)) {
        struct.timestamp = iprot.readString();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(4)) {
        struct.detectionSystemId = iprot.readString();
        struct.setDetectionSystemIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.resource = new Resource();
        struct.resource.read(iprot);
        struct.setResourceIsSet(true);
      }
    }
  }

}


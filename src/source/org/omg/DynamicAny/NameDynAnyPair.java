package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u333/2551/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Monday, April 25, 2022 10:50:42 PM PDT
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
        * The name associated with the DynAny.
        */
  public String id = null;

  /**
        * The DynAny value associated with the name.
        */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair

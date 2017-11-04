// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.EnvFromSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.kubernetes.api.model.RBDVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.SecretEnvSource
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource


fun  CephFSVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  EnvFromSource.`secretRef`(block: SecretEnvSource.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = SecretEnvSource()
  }

  this.`secretRef`.block()
}


fun  FlexVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  ISCSIVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  RBDVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  ScaleIOVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


fun  StorageOSPersistentVolumeSource.`secretRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = ObjectReference()
  }

  this.`secretRef`.block()
}


fun  StorageOSVolumeSource.`secretRef`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secretRef` == null) {
    this.`secretRef` = LocalObjectReference()
  }

  this.`secretRef`.block()
}


/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a block device for an EBS volume.
 * </p>
 */
public class EbsBlockDevice implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: <code>1-1024</code> for <code>standard</code> volumes,
     * <code>1-16384</code> for <code>gp2</code> volumes, and
     * <code>4-16384</code> for <code>io1</code> volumes. If you specify a
     * snapshot, the volume size must be equal to or larger than the snapshot
     * size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS (SSD) volumes, this represents the number of IOPS
     * that are provisioned for the volume. For General Purpose (SSD) volumes,
     * this represents the baseline performance of the volume and the rate at
     * which the volume accumulates I/O credits for bursting. For more
     * information on General Purpose (SSD) baseline performance, I/O credits,
     * and bursting, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD) volumes and
     * 3 to 10000 for General Purpose (SSD) volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>standard</code> or <code>gp2</code> volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EbsBlockDevice withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: <code>1-1024</code> for <code>standard</code> volumes,
     * <code>1-16384</code> for <code>gp2</code> volumes, and
     * <code>4-16384</code> for <code>io1</code> volumes. If you specify a
     * snapshot, the volume size must be equal to or larger than the snapshot
     * size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.</p>
     *        <p>
     *        Constraints: <code>1-1024</code> for <code>standard</code>
     *        volumes, <code>1-16384</code> for <code>gp2</code> volumes, and
     *        <code>4-16384</code> for <code>io1</code> volumes. If you specify
     *        a snapshot, the volume size must be equal to or larger than the
     *        snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't
     *        specify a volume size, the default is the snapshot size.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: <code>1-1024</code> for <code>standard</code> volumes,
     * <code>1-16384</code> for <code>gp2</code> volumes, and
     * <code>4-16384</code> for <code>io1</code> volumes. If you specify a
     * snapshot, the volume size must be equal to or larger than the snapshot
     * size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * 
     * @return The size of the volume, in GiB.</p>
     *         <p>
     *         Constraints: <code>1-1024</code> for <code>standard</code>
     *         volumes, <code>1-16384</code> for <code>gp2</code> volumes, and
     *         <code>4-16384</code> for <code>io1</code> volumes. If you specify
     *         a snapshot, the volume size must be equal to or larger than the
     *         snapshot size.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Constraints: <code>1-1024</code> for <code>standard</code> volumes,
     * <code>1-16384</code> for <code>gp2</code> volumes, and
     * <code>4-16384</code> for <code>io1</code> volumes. If you specify a
     * snapshot, the volume size must be equal to or larger than the snapshot
     * size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.</p>
     *        <p>
     *        Constraints: <code>1-1024</code> for <code>standard</code>
     *        volumes, <code>1-16384</code> for <code>gp2</code> volumes, and
     *        <code>4-16384</code> for <code>io1</code> volumes. If you specify
     *        a snapshot, the volume size must be equal to or larger than the
     *        snapshot size.
     *        </p>
     *        <p>
     *        Default: If you're creating the volume from a snapshot and don't
     *        specify a volume size, the default is the snapshot size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance
     *        termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance
     *         termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance
     *        termination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance
     *         termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD)
     *        volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @return The volume type. <code>gp2</code> for General Purpose (SSD)
     *         volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *         <code>standard</code> for Magnetic volumes.</p>
     *         <p>
     *         Default: <code>standard</code>
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD)
     *        volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD)
     *        volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     * <code>standard</code> for Magnetic volumes.
     * </p>
     * <p>
     * Default: <code>standard</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. <code>gp2</code> for General Purpose (SSD)
     *        volumes, <code>io1</code> for Provisioned IOPS (SSD) volumes, and
     *        <code>standard</code> for Magnetic volumes.</p>
     *        <p>
     *        Default: <code>standard</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(VolumeType volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS (SSD) volumes, this represents the number of IOPS
     * that are provisioned for the volume. For General Purpose (SSD) volumes,
     * this represents the baseline performance of the volume and the rate at
     * which the volume accumulates I/O credits for bursting. For more
     * information on General Purpose (SSD) baseline performance, I/O credits,
     * and bursting, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD) volumes and
     * 3 to 10000 for General Purpose (SSD) volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>standard</code> or <code>gp2</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume
     *        supports. For Provisioned IOPS (SSD) volumes, this represents the
     *        number of IOPS that are provisioned for the volume. For General
     *        Purpose (SSD) volumes, this represents the baseline performance of
     *        the volume and the rate at which the volume accumulates I/O
     *        credits for bursting. For more information on General Purpose
     *        (SSD) baseline performance, I/O credits, and bursting, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *        >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.</p>
     *        <p>
     *        Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD)
     *        volumes and 3 to 10000 for General Purpose (SSD) volumes.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create
     *        <code>io1</code> volumes; it is not used in requests to create
     *        <code>standard</code> or <code>gp2</code> volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS (SSD) volumes, this represents the number of IOPS
     * that are provisioned for the volume. For General Purpose (SSD) volumes,
     * this represents the baseline performance of the volume and the rate at
     * which the volume accumulates I/O credits for bursting. For more
     * information on General Purpose (SSD) baseline performance, I/O credits,
     * and bursting, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD) volumes and
     * 3 to 10000 for General Purpose (SSD) volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>standard</code> or <code>gp2</code> volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS) that the volume
     *         supports. For Provisioned IOPS (SSD) volumes, this represents the
     *         number of IOPS that are provisioned for the volume. For General
     *         Purpose (SSD) volumes, this represents the baseline performance
     *         of the volume and the rate at which the volume accumulates I/O
     *         credits for bursting. For more information on General Purpose
     *         (SSD) baseline performance, I/O credits, and bursting, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.</p>
     *         <p>
     *         Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD)
     *         volumes and 3 to 10000 for General Purpose (SSD) volumes.
     *         </p>
     *         <p>
     *         Condition: This parameter is required for requests to create
     *         <code>io1</code> volumes; it is not used in requests to create
     *         <code>standard</code> or <code>gp2</code> volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For Provisioned IOPS (SSD) volumes, this represents the number of IOPS
     * that are provisioned for the volume. For General Purpose (SSD) volumes,
     * this represents the baseline performance of the volume and the rate at
     * which the volume accumulates I/O credits for bursting. For more
     * information on General Purpose (SSD) baseline performance, I/O credits,
     * and bursting, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD) volumes and
     * 3 to 10000 for General Purpose (SSD) volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code> volumes; it is not used in requests to create
     * <code>standard</code> or <code>gp2</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS) that the volume
     *        supports. For Provisioned IOPS (SSD) volumes, this represents the
     *        number of IOPS that are provisioned for the volume. For General
     *        Purpose (SSD) volumes, this represents the baseline performance of
     *        the volume and the rate at which the volume accumulates I/O
     *        credits for bursting. For more information on General Purpose
     *        (SSD) baseline performance, I/O credits, and bursting, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *        >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.</p>
     *        <p>
     *        Constraint: Range is 100 to 20000 for Provisioned IOPS (SSD)
     *        volumes and 3 to 10000 for General Purpose (SSD) volumes.
     *        </p>
     *        <p>
     *        Condition: This parameter is required for requests to create
     *        <code>io1</code> volumes; it is not used in requests to create
     *        <code>standard</code> or <code>gp2</code> volumes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EbsBlockDevice withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted Amazon
     *        EBS volumes may only be attached to instances that support Amazon
     *        EBS encryption.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted Amazon
     *         EBS volumes may only be attached to instances that support Amazon
     *         EBS encryption.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the EBS volume is encrypted. Encrypted Amazon
     *        EBS volumes may only be attached to instances that support Amazon
     *        EBS encryption.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EbsBlockDevice withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted Amazon EBS
     * volumes may only be attached to instances that support Amazon EBS
     * encryption.
     * </p>
     * 
     * @return Indicates whether the EBS volume is encrypted. Encrypted Amazon
     *         EBS volumes may only be attached to instances that support Amazon
     *         EBS encryption.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDevice == false)
            return false;
        EbsBlockDevice other = (EbsBlockDevice) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getDeleteOnTermination() == null
                ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(
                        this.getDeleteOnTermination()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null
                && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteOnTermination() == null) ? 0
                        : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode
                + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode
                + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public EbsBlockDevice clone() {
        try {
            return (EbsBlockDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

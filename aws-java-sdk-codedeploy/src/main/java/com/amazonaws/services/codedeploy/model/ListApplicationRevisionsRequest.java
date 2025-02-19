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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a list application revisions operation.
 * </p>
 */
public class ListApplicationRevisionsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The column name to sort the list results by:
     * </p>
     * <ul>
     * <li>registerTime: Sort the list results by when the revisions were
     * registered with AWS CodeDeploy.</li>
     * <li>firstUsedTime: Sort the list results by when the revisions were first
     * used by in a deployment.</li>
     * <li>lastUsedTime: Sort the list results by when the revisions were last
     * used in a deployment.</li>
     * </ul>
     * <p>
     * If not specified or set to null, the results will be returned in an
     * arbitrary order.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order to sort the list results by:
     * </p>
     * <ul>
     * <li>ascending: Sort the list of results in ascending order.</li>
     * <li>descending: Sort the list of results in descending order.</li>
     * </ul>
     * <p>
     * If not specified, the results will be sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results will be sorted in an arbitrary order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, then all of the user's buckets will be searched.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group:
     * </p>
     * <ul>
     * <li>include: List revisions that are target revisions of a deployment
     * group.</li>
     * <li>exclude: Do not list revisions that are target revisions of a
     * deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li>
     * </ul>
     */
    private String deployed;
    /**
     * <p>
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of applications
     * in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing AWS CodeDeploy application associated with
     *        the applicable IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of an existing AWS CodeDeploy application associated
     *         with the applicable IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing AWS CodeDeploy application associated with
     *        the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationRevisionsRequest withApplicationName(
            String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The column name to sort the list results by:
     * </p>
     * <ul>
     * <li>registerTime: Sort the list results by when the revisions were
     * registered with AWS CodeDeploy.</li>
     * <li>firstUsedTime: Sort the list results by when the revisions were first
     * used by in a deployment.</li>
     * <li>lastUsedTime: Sort the list results by when the revisions were last
     * used in a deployment.</li>
     * </ul>
     * <p>
     * If not specified or set to null, the results will be returned in an
     * arbitrary order.
     * </p>
     * 
     * @param sortBy
     *        The column name to sort the list results by:</p>
     *        <ul>
     *        <li>registerTime: Sort the list results by when the revisions were
     *        registered with AWS CodeDeploy.</li>
     *        <li>firstUsedTime: Sort the list results by when the revisions
     *        were first used by in a deployment.</li>
     *        <li>lastUsedTime: Sort the list results by when the revisions were
     *        last used in a deployment.</li>
     *        </ul>
     *        <p>
     *        If not specified or set to null, the results will be returned in
     *        an arbitrary order.
     * @see ApplicationRevisionSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The column name to sort the list results by:
     * </p>
     * <ul>
     * <li>registerTime: Sort the list results by when the revisions were
     * registered with AWS CodeDeploy.</li>
     * <li>firstUsedTime: Sort the list results by when the revisions were first
     * used by in a deployment.</li>
     * <li>lastUsedTime: Sort the list results by when the revisions were last
     * used in a deployment.</li>
     * </ul>
     * <p>
     * If not specified or set to null, the results will be returned in an
     * arbitrary order.
     * </p>
     * 
     * @return The column name to sort the list results by:</p>
     *         <ul>
     *         <li>registerTime: Sort the list results by when the revisions
     *         were registered with AWS CodeDeploy.</li>
     *         <li>firstUsedTime: Sort the list results by when the revisions
     *         were first used by in a deployment.</li>
     *         <li>lastUsedTime: Sort the list results by when the revisions
     *         were last used in a deployment.</li>
     *         </ul>
     *         <p>
     *         If not specified or set to null, the results will be returned in
     *         an arbitrary order.
     * @see ApplicationRevisionSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The column name to sort the list results by:
     * </p>
     * <ul>
     * <li>registerTime: Sort the list results by when the revisions were
     * registered with AWS CodeDeploy.</li>
     * <li>firstUsedTime: Sort the list results by when the revisions were first
     * used by in a deployment.</li>
     * <li>lastUsedTime: Sort the list results by when the revisions were last
     * used in a deployment.</li>
     * </ul>
     * <p>
     * If not specified or set to null, the results will be returned in an
     * arbitrary order.
     * </p>
     * 
     * @param sortBy
     *        The column name to sort the list results by:</p>
     *        <ul>
     *        <li>registerTime: Sort the list results by when the revisions were
     *        registered with AWS CodeDeploy.</li>
     *        <li>firstUsedTime: Sort the list results by when the revisions
     *        were first used by in a deployment.</li>
     *        <li>lastUsedTime: Sort the list results by when the revisions were
     *        last used in a deployment.</li>
     *        </ul>
     *        <p>
     *        If not specified or set to null, the results will be returned in
     *        an arbitrary order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ApplicationRevisionSortBy
     */

    public ListApplicationRevisionsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The column name to sort the list results by:
     * </p>
     * <ul>
     * <li>registerTime: Sort the list results by when the revisions were
     * registered with AWS CodeDeploy.</li>
     * <li>firstUsedTime: Sort the list results by when the revisions were first
     * used by in a deployment.</li>
     * <li>lastUsedTime: Sort the list results by when the revisions were last
     * used in a deployment.</li>
     * </ul>
     * <p>
     * If not specified or set to null, the results will be returned in an
     * arbitrary order.
     * </p>
     * 
     * @param sortBy
     *        The column name to sort the list results by:</p>
     *        <ul>
     *        <li>registerTime: Sort the list results by when the revisions were
     *        registered with AWS CodeDeploy.</li>
     *        <li>firstUsedTime: Sort the list results by when the revisions
     *        were first used by in a deployment.</li>
     *        <li>lastUsedTime: Sort the list results by when the revisions were
     *        last used in a deployment.</li>
     *        </ul>
     *        <p>
     *        If not specified or set to null, the results will be returned in
     *        an arbitrary order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ApplicationRevisionSortBy
     */

    public void setSortBy(ApplicationRevisionSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The column name to sort the list results by:
     * </p>
     * <ul>
     * <li>registerTime: Sort the list results by when the revisions were
     * registered with AWS CodeDeploy.</li>
     * <li>firstUsedTime: Sort the list results by when the revisions were first
     * used by in a deployment.</li>
     * <li>lastUsedTime: Sort the list results by when the revisions were last
     * used in a deployment.</li>
     * </ul>
     * <p>
     * If not specified or set to null, the results will be returned in an
     * arbitrary order.
     * </p>
     * 
     * @param sortBy
     *        The column name to sort the list results by:</p>
     *        <ul>
     *        <li>registerTime: Sort the list results by when the revisions were
     *        registered with AWS CodeDeploy.</li>
     *        <li>firstUsedTime: Sort the list results by when the revisions
     *        were first used by in a deployment.</li>
     *        <li>lastUsedTime: Sort the list results by when the revisions were
     *        last used in a deployment.</li>
     *        </ul>
     *        <p>
     *        If not specified or set to null, the results will be returned in
     *        an arbitrary order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ApplicationRevisionSortBy
     */

    public ListApplicationRevisionsRequest withSortBy(
            ApplicationRevisionSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The order to sort the list results by:
     * </p>
     * <ul>
     * <li>ascending: Sort the list of results in ascending order.</li>
     * <li>descending: Sort the list of results in descending order.</li>
     * </ul>
     * <p>
     * If not specified, the results will be sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results will be sorted in an arbitrary order.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort the list results by:</p>
     *        <ul>
     *        <li>ascending: Sort the list of results in ascending order.</li>
     *        <li>descending: Sort the list of results in descending order.</li>
     *        </ul>
     *        <p>
     *        If not specified, the results will be sorted in ascending order.
     *        </p>
     *        <p>
     *        If set to null, the results will be sorted in an arbitrary order.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to sort the list results by:
     * </p>
     * <ul>
     * <li>ascending: Sort the list of results in ascending order.</li>
     * <li>descending: Sort the list of results in descending order.</li>
     * </ul>
     * <p>
     * If not specified, the results will be sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results will be sorted in an arbitrary order.
     * </p>
     * 
     * @return The order to sort the list results by:</p>
     *         <ul>
     *         <li>ascending: Sort the list of results in ascending order.</li>
     *         <li>descending: Sort the list of results in descending order.</li>
     *         </ul>
     *         <p>
     *         If not specified, the results will be sorted in ascending order.
     *         </p>
     *         <p>
     *         If set to null, the results will be sorted in an arbitrary order.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to sort the list results by:
     * </p>
     * <ul>
     * <li>ascending: Sort the list of results in ascending order.</li>
     * <li>descending: Sort the list of results in descending order.</li>
     * </ul>
     * <p>
     * If not specified, the results will be sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results will be sorted in an arbitrary order.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort the list results by:</p>
     *        <ul>
     *        <li>ascending: Sort the list of results in ascending order.</li>
     *        <li>descending: Sort the list of results in descending order.</li>
     *        </ul>
     *        <p>
     *        If not specified, the results will be sorted in ascending order.
     *        </p>
     *        <p>
     *        If set to null, the results will be sorted in an arbitrary order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SortOrder
     */

    public ListApplicationRevisionsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to sort the list results by:
     * </p>
     * <ul>
     * <li>ascending: Sort the list of results in ascending order.</li>
     * <li>descending: Sort the list of results in descending order.</li>
     * </ul>
     * <p>
     * If not specified, the results will be sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results will be sorted in an arbitrary order.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort the list results by:</p>
     *        <ul>
     *        <li>ascending: Sort the list of results in ascending order.</li>
     *        <li>descending: Sort the list of results in descending order.</li>
     *        </ul>
     *        <p>
     *        If not specified, the results will be sorted in ascending order.
     *        </p>
     *        <p>
     *        If set to null, the results will be sorted in an arbitrary order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SortOrder
     */

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The order to sort the list results by:
     * </p>
     * <ul>
     * <li>ascending: Sort the list of results in ascending order.</li>
     * <li>descending: Sort the list of results in descending order.</li>
     * </ul>
     * <p>
     * If not specified, the results will be sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results will be sorted in an arbitrary order.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort the list results by:</p>
     *        <ul>
     *        <li>ascending: Sort the list of results in ascending order.</li>
     *        <li>descending: Sort the list of results in descending order.</li>
     *        </ul>
     *        <p>
     *        If not specified, the results will be sorted in ascending order.
     *        </p>
     *        <p>
     *        If set to null, the results will be sorted in an arbitrary order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SortOrder
     */

    public ListApplicationRevisionsRequest withSortOrder(SortOrder sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, then all of the user's buckets will be searched.
     * </p>
     * 
     * @param s3Bucket
     *        A specific Amazon S3 bucket name to limit the search for
     *        revisions.</p>
     *        <p>
     *        If set to null, then all of the user's buckets will be searched.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, then all of the user's buckets will be searched.
     * </p>
     * 
     * @return A specific Amazon S3 bucket name to limit the search for
     *         revisions.</p>
     *         <p>
     *         If set to null, then all of the user's buckets will be searched.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * A specific Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, then all of the user's buckets will be searched.
     * </p>
     * 
     * @param s3Bucket
     *        A specific Amazon S3 bucket name to limit the search for
     *        revisions.</p>
     *        <p>
     *        If set to null, then all of the user's buckets will be searched.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationRevisionsRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     * </p>
     * 
     * @param s3KeyPrefix
     *        A specific key prefix for the set of Amazon S3 objects to limit
     *        the search for revisions.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     * </p>
     * 
     * @return A specific key prefix for the set of Amazon S3 objects to limit
     *         the search for revisions.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * A specific key prefix for the set of Amazon S3 objects to limit the
     * search for revisions.
     * </p>
     * 
     * @param s3KeyPrefix
     *        A specific key prefix for the set of Amazon S3 objects to limit
     *        the search for revisions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationRevisionsRequest withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group:
     * </p>
     * <ul>
     * <li>include: List revisions that are target revisions of a deployment
     * group.</li>
     * <li>exclude: Do not list revisions that are target revisions of a
     * deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li>
     * </ul>
     * 
     * @param deployed
     *        Whether to list revisions based on whether the revision is the
     *        target revision of an deployment group:</p>
     *        <ul>
     *        <li>include: List revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>exclude: Do not list revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>ignore: List all revisions, regardless of whether they are
     *        target revisions of a deployment group.</li>
     * @see ListStateFilterAction
     */

    public void setDeployed(String deployed) {
        this.deployed = deployed;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group:
     * </p>
     * <ul>
     * <li>include: List revisions that are target revisions of a deployment
     * group.</li>
     * <li>exclude: Do not list revisions that are target revisions of a
     * deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li>
     * </ul>
     * 
     * @return Whether to list revisions based on whether the revision is the
     *         target revision of an deployment group:</p>
     *         <ul>
     *         <li>include: List revisions that are target revisions of a
     *         deployment group.</li>
     *         <li>exclude: Do not list revisions that are target revisions of a
     *         deployment group.</li>
     *         <li>ignore: List all revisions, regardless of whether they are
     *         target revisions of a deployment group.</li>
     * @see ListStateFilterAction
     */

    public String getDeployed() {
        return this.deployed;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group:
     * </p>
     * <ul>
     * <li>include: List revisions that are target revisions of a deployment
     * group.</li>
     * <li>exclude: Do not list revisions that are target revisions of a
     * deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li>
     * </ul>
     * 
     * @param deployed
     *        Whether to list revisions based on whether the revision is the
     *        target revision of an deployment group:</p>
     *        <ul>
     *        <li>include: List revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>exclude: Do not list revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>ignore: List all revisions, regardless of whether they are
     *        target revisions of a deployment group.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ListStateFilterAction
     */

    public ListApplicationRevisionsRequest withDeployed(String deployed) {
        setDeployed(deployed);
        return this;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group:
     * </p>
     * <ul>
     * <li>include: List revisions that are target revisions of a deployment
     * group.</li>
     * <li>exclude: Do not list revisions that are target revisions of a
     * deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li>
     * </ul>
     * 
     * @param deployed
     *        Whether to list revisions based on whether the revision is the
     *        target revision of an deployment group:</p>
     *        <ul>
     *        <li>include: List revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>exclude: Do not list revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>ignore: List all revisions, regardless of whether they are
     *        target revisions of a deployment group.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ListStateFilterAction
     */

    public void setDeployed(ListStateFilterAction deployed) {
        this.deployed = deployed.toString();
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of an deployment group:
     * </p>
     * <ul>
     * <li>include: List revisions that are target revisions of a deployment
     * group.</li>
     * <li>exclude: Do not list revisions that are target revisions of a
     * deployment group.</li>
     * <li>ignore: List all revisions, regardless of whether they are target
     * revisions of a deployment group.</li>
     * </ul>
     * 
     * @param deployed
     *        Whether to list revisions based on whether the revision is the
     *        target revision of an deployment group:</p>
     *        <ul>
     *        <li>include: List revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>exclude: Do not list revisions that are target revisions of a
     *        deployment group.</li>
     *        <li>ignore: List all revisions, regardless of whether they are
     *        target revisions of a deployment group.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ListStateFilterAction
     */

    public ListApplicationRevisionsRequest withDeployed(
            ListStateFilterAction deployed) {
        setDeployed(deployed);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of applications
     * in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous list application
     *        revisions call, which can be used to return the next set of
     *        applications in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of applications
     * in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous list
     *         application revisions call, which can be used to return the next
     *         set of applications in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list application
     * revisions call, which can be used to return the next set of applications
     * in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous list application
     *        revisions call, which can be used to return the next set of
     *        applications in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationRevisionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getDeployed() != null)
            sb.append("Deployed: " + getDeployed() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationRevisionsRequest == false)
            return false;
        ListApplicationRevisionsRequest other = (ListApplicationRevisionsRequest) obj;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null
                && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null
                && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getDeployed() == null ^ this.getDeployed() == null)
            return false;
        if (other.getDeployed() != null
                && other.getDeployed().equals(this.getDeployed()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode
                + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode
                + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getDeployed() == null) ? 0 : getDeployed().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationRevisionsRequest clone() {
        return (ListApplicationRevisionsRequest) super.clone();
    }
}
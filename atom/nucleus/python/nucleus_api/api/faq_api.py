# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.7.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from nucleus_api.api_client import ApiClient


class FAQApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_faq_using_post(self, faq_request, **kwargs):  # noqa: E501
        """Create a FAQ  # noqa: E501

        Create a new FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_faq_using_post(faq_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Faq faq_request: faqRequest (required)
        :return: Faq
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_faq_using_post_with_http_info(faq_request, **kwargs)  # noqa: E501
        else:
            (data) = self.create_faq_using_post_with_http_info(faq_request, **kwargs)  # noqa: E501
            return data

    def create_faq_using_post_with_http_info(self, faq_request, **kwargs):  # noqa: E501
        """Create a FAQ  # noqa: E501

        Create a new FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_faq_using_post_with_http_info(faq_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Faq faq_request: faqRequest (required)
        :return: Faq
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['faq_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_faq_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'faq_request' is set
        if ('faq_request' not in params or
                params['faq_request'] is None):
            raise ValueError("Missing the required parameter `faq_request` when calling `create_faq_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'faq_request' in params:
            body_params = params['faq_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/faq', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Faq',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_faq_using_delete(self, faq_id, **kwargs):  # noqa: E501
        """Delete a FAQ  # noqa: E501

        Permanently delete a FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_faq_using_delete(faq_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str faq_id: UUID faq_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_faq_using_delete_with_http_info(faq_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_faq_using_delete_with_http_info(faq_id, **kwargs)  # noqa: E501
            return data

    def delete_faq_using_delete_with_http_info(self, faq_id, **kwargs):  # noqa: E501
        """Delete a FAQ  # noqa: E501

        Permanently delete a FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_faq_using_delete_with_http_info(faq_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str faq_id: UUID faq_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['faq_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_faq_using_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'faq_id' is set
        if ('faq_id' not in params or
                params['faq_id'] is None):
            raise ValueError("Missing the required parameter `faq_id` when calling `delete_faq_using_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'faq_id' in params:
            path_params['faq_id'] = params['faq_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/faq/{faq_id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_faq_all_using_get(self, **kwargs):  # noqa: E501
        """List all FAQ  # noqa: E501

        Get the information for all FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_faq_all_using_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageFaq
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_faq_all_using_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_faq_all_using_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_faq_all_using_get_with_http_info(self, **kwargs):  # noqa: E501
        """List all FAQ  # noqa: E501

        Get the information for all FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_faq_all_using_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageFaq
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ascending', 'filter', 'order_by', 'page', 'size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_faq_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'ascending' in params:
            query_params.append(('ascending', params['ascending']))  # noqa: E501
        if 'filter' in params:
            query_params.append(('filter', params['filter']))  # noqa: E501
        if 'order_by' in params:
            query_params.append(('order_by', params['order_by']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'size' in params:
            query_params.append(('size', params['size']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/faq', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PageFaq',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_faq_using_get(self, faq_id, **kwargs):  # noqa: E501
        """Retrieve a FAQ  # noqa: E501

        Retrieve the information for a FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_faq_using_get(faq_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str faq_id: UUID faq_id (required)
        :return: Faq
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_faq_using_get_with_http_info(faq_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_faq_using_get_with_http_info(faq_id, **kwargs)  # noqa: E501
            return data

    def get_faq_using_get_with_http_info(self, faq_id, **kwargs):  # noqa: E501
        """Retrieve a FAQ  # noqa: E501

        Retrieve the information for a FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_faq_using_get_with_http_info(faq_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str faq_id: UUID faq_id (required)
        :return: Faq
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['faq_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_faq_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'faq_id' is set
        if ('faq_id' not in params or
                params['faq_id'] is None):
            raise ValueError("Missing the required parameter `faq_id` when calling `get_faq_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'faq_id' in params:
            path_params['faq_id'] = params['faq_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/faq/{faq_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Faq',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_faq_using_put(self, faq, faq_id, **kwargs):  # noqa: E501
        """Update a FAQ  # noqa: E501

        Update the information for a FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_faq_using_put(faq, faq_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Faq faq: faq (required)
        :param str faq_id: UUID faq_id (required)
        :return: Faq
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_faq_using_put_with_http_info(faq, faq_id, **kwargs)  # noqa: E501
        else:
            (data) = self.update_faq_using_put_with_http_info(faq, faq_id, **kwargs)  # noqa: E501
            return data

    def update_faq_using_put_with_http_info(self, faq, faq_id, **kwargs):  # noqa: E501
        """Update a FAQ  # noqa: E501

        Update the information for a FAQ  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_faq_using_put_with_http_info(faq, faq_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Faq faq: faq (required)
        :param str faq_id: UUID faq_id (required)
        :return: Faq
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['faq', 'faq_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_faq_using_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'faq' is set
        if ('faq' not in params or
                params['faq'] is None):
            raise ValueError("Missing the required parameter `faq` when calling `update_faq_using_put`")  # noqa: E501
        # verify the required parameter 'faq_id' is set
        if ('faq_id' not in params or
                params['faq_id'] is None):
            raise ValueError("Missing the required parameter `faq_id` when calling `update_faq_using_put`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'faq_id' in params:
            path_params['faq_id'] = params['faq_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'faq' in params:
            body_params = params['faq']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/faq/{faq_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Faq',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

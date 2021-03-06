# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.7.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class AccountAdvisorVO(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'account_type': 'str',
        'accounts_managed': 'int',
        'assets_managed': 'float',
        'clients_managed': 'int'
    }

    attribute_map = {
        'account_type': 'account_type',
        'accounts_managed': 'accounts_managed',
        'assets_managed': 'assets_managed',
        'clients_managed': 'clients_managed'
    }

    def __init__(self, account_type=None, accounts_managed=None, assets_managed=None, clients_managed=None):  # noqa: E501
        """AccountAdvisorVO - a model defined in Swagger"""  # noqa: E501

        self._account_type = None
        self._accounts_managed = None
        self._assets_managed = None
        self._clients_managed = None
        self.discriminator = None

        if account_type is not None:
            self.account_type = account_type
        if accounts_managed is not None:
            self.accounts_managed = accounts_managed
        if assets_managed is not None:
            self.assets_managed = assets_managed
        if clients_managed is not None:
            self.clients_managed = clients_managed

    @property
    def account_type(self):
        """Gets the account_type of this AccountAdvisorVO.  # noqa: E501


        :return: The account_type of this AccountAdvisorVO.  # noqa: E501
        :rtype: str
        """
        return self._account_type

    @account_type.setter
    def account_type(self, account_type):
        """Sets the account_type of this AccountAdvisorVO.


        :param account_type: The account_type of this AccountAdvisorVO.  # noqa: E501
        :type: str
        """

        self._account_type = account_type

    @property
    def accounts_managed(self):
        """Gets the accounts_managed of this AccountAdvisorVO.  # noqa: E501


        :return: The accounts_managed of this AccountAdvisorVO.  # noqa: E501
        :rtype: int
        """
        return self._accounts_managed

    @accounts_managed.setter
    def accounts_managed(self, accounts_managed):
        """Sets the accounts_managed of this AccountAdvisorVO.


        :param accounts_managed: The accounts_managed of this AccountAdvisorVO.  # noqa: E501
        :type: int
        """

        self._accounts_managed = accounts_managed

    @property
    def assets_managed(self):
        """Gets the assets_managed of this AccountAdvisorVO.  # noqa: E501


        :return: The assets_managed of this AccountAdvisorVO.  # noqa: E501
        :rtype: float
        """
        return self._assets_managed

    @assets_managed.setter
    def assets_managed(self, assets_managed):
        """Sets the assets_managed of this AccountAdvisorVO.


        :param assets_managed: The assets_managed of this AccountAdvisorVO.  # noqa: E501
        :type: float
        """

        self._assets_managed = assets_managed

    @property
    def clients_managed(self):
        """Gets the clients_managed of this AccountAdvisorVO.  # noqa: E501


        :return: The clients_managed of this AccountAdvisorVO.  # noqa: E501
        :rtype: int
        """
        return self._clients_managed

    @clients_managed.setter
    def clients_managed(self, clients_managed):
        """Sets the clients_managed of this AccountAdvisorVO.


        :param clients_managed: The clients_managed of this AccountAdvisorVO.  # noqa: E501
        :type: int
        """

        self._clients_managed = clients_managed

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(AccountAdvisorVO, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AccountAdvisorVO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

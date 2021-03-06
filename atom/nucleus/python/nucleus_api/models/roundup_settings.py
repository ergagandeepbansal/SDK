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


class RoundupSettings(object):
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
        'account_id': 'str',
        'accounts': 'list[AccountMap]',
        'aggregation_accounts': 'list[AggregationAccountsMap]',
        'bank_links': 'list[BankLinkMap]',
        'categories': 'list[CategoriesMap]',
        'client_id': 'str',
        'create_date': 'datetime',
        'id': 'str',
        'is_active': 'bool',
        'merchants': 'list[MerchantsMap]',
        'metadata': 'dict(str, str)',
        'portfolio_id': 'str',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_id': 'account_id',
        'accounts': 'accounts',
        'aggregation_accounts': 'aggregation_accounts',
        'bank_links': 'bank_links',
        'categories': 'categories',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'id': 'id',
        'is_active': 'is_active',
        'merchants': 'merchants',
        'metadata': 'metadata',
        'portfolio_id': 'portfolio_id',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, account_id=None, accounts=None, aggregation_accounts=None, bank_links=None, categories=None, client_id=None, create_date=None, id=None, is_active=None, merchants=None, metadata=None, portfolio_id=None, secondary_id=None, update_date=None):  # noqa: E501
        """RoundupSettings - a model defined in Swagger"""  # noqa: E501

        self._account_id = None
        self._accounts = None
        self._aggregation_accounts = None
        self._bank_links = None
        self._categories = None
        self._client_id = None
        self._create_date = None
        self._id = None
        self._is_active = None
        self._merchants = None
        self._metadata = None
        self._portfolio_id = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.account_id = account_id
        if accounts is not None:
            self.accounts = accounts
        if aggregation_accounts is not None:
            self.aggregation_accounts = aggregation_accounts
        self.bank_links = bank_links
        if categories is not None:
            self.categories = categories
        self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if merchants is not None:
            self.merchants = merchants
        if metadata is not None:
            self.metadata = metadata
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_id(self):
        """Gets the account_id of this RoundupSettings.  # noqa: E501

        account_id  # noqa: E501

        :return: The account_id of this RoundupSettings.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this RoundupSettings.

        account_id  # noqa: E501

        :param account_id: The account_id of this RoundupSettings.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def accounts(self):
        """Gets the accounts of this RoundupSettings.  # noqa: E501


        :return: The accounts of this RoundupSettings.  # noqa: E501
        :rtype: list[AccountMap]
        """
        return self._accounts

    @accounts.setter
    def accounts(self, accounts):
        """Sets the accounts of this RoundupSettings.


        :param accounts: The accounts of this RoundupSettings.  # noqa: E501
        :type: list[AccountMap]
        """

        self._accounts = accounts

    @property
    def aggregation_accounts(self):
        """Gets the aggregation_accounts of this RoundupSettings.  # noqa: E501


        :return: The aggregation_accounts of this RoundupSettings.  # noqa: E501
        :rtype: list[AggregationAccountsMap]
        """
        return self._aggregation_accounts

    @aggregation_accounts.setter
    def aggregation_accounts(self, aggregation_accounts):
        """Sets the aggregation_accounts of this RoundupSettings.


        :param aggregation_accounts: The aggregation_accounts of this RoundupSettings.  # noqa: E501
        :type: list[AggregationAccountsMap]
        """

        self._aggregation_accounts = aggregation_accounts

    @property
    def bank_links(self):
        """Gets the bank_links of this RoundupSettings.  # noqa: E501


        :return: The bank_links of this RoundupSettings.  # noqa: E501
        :rtype: list[BankLinkMap]
        """
        return self._bank_links

    @bank_links.setter
    def bank_links(self, bank_links):
        """Sets the bank_links of this RoundupSettings.


        :param bank_links: The bank_links of this RoundupSettings.  # noqa: E501
        :type: list[BankLinkMap]
        """
        if bank_links is None:
            raise ValueError("Invalid value for `bank_links`, must not be `None`")  # noqa: E501

        self._bank_links = bank_links

    @property
    def categories(self):
        """Gets the categories of this RoundupSettings.  # noqa: E501


        :return: The categories of this RoundupSettings.  # noqa: E501
        :rtype: list[CategoriesMap]
        """
        return self._categories

    @categories.setter
    def categories(self, categories):
        """Sets the categories of this RoundupSettings.


        :param categories: The categories of this RoundupSettings.  # noqa: E501
        :type: list[CategoriesMap]
        """

        self._categories = categories

    @property
    def client_id(self):
        """Gets the client_id of this RoundupSettings.  # noqa: E501

        client_id  # noqa: E501

        :return: The client_id of this RoundupSettings.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this RoundupSettings.

        client_id  # noqa: E501

        :param client_id: The client_id of this RoundupSettings.  # noqa: E501
        :type: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this RoundupSettings.  # noqa: E501


        :return: The create_date of this RoundupSettings.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this RoundupSettings.


        :param create_date: The create_date of this RoundupSettings.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def id(self):
        """Gets the id of this RoundupSettings.  # noqa: E501


        :return: The id of this RoundupSettings.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RoundupSettings.


        :param id: The id of this RoundupSettings.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this RoundupSettings.  # noqa: E501

        is_active  # noqa: E501

        :return: The is_active of this RoundupSettings.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this RoundupSettings.

        is_active  # noqa: E501

        :param is_active: The is_active of this RoundupSettings.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def merchants(self):
        """Gets the merchants of this RoundupSettings.  # noqa: E501


        :return: The merchants of this RoundupSettings.  # noqa: E501
        :rtype: list[MerchantsMap]
        """
        return self._merchants

    @merchants.setter
    def merchants(self, merchants):
        """Sets the merchants of this RoundupSettings.


        :param merchants: The merchants of this RoundupSettings.  # noqa: E501
        :type: list[MerchantsMap]
        """

        self._merchants = merchants

    @property
    def metadata(self):
        """Gets the metadata of this RoundupSettings.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this RoundupSettings.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this RoundupSettings.

        metadata  # noqa: E501

        :param metadata: The metadata of this RoundupSettings.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this RoundupSettings.  # noqa: E501

        portfolio_id  # noqa: E501

        :return: The portfolio_id of this RoundupSettings.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this RoundupSettings.

        portfolio_id  # noqa: E501

        :param portfolio_id: The portfolio_id of this RoundupSettings.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this RoundupSettings.  # noqa: E501


        :return: The secondary_id of this RoundupSettings.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this RoundupSettings.


        :param secondary_id: The secondary_id of this RoundupSettings.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this RoundupSettings.  # noqa: E501


        :return: The update_date of this RoundupSettings.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this RoundupSettings.


        :param update_date: The update_date of this RoundupSettings.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

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
        if issubclass(RoundupSettings, dict):
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
        if not isinstance(other, RoundupSettings):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

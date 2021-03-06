# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.7.18
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class EventStudyRequest(object):
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
        'events': 'list[str]',
        'use_proxy_data': 'bool',
        'portfolio_tickers': 'list[str]',
        'model_id': 'str',
        'allocation_id': 'str',
        'account_id': 'str',
        'portfolio_id': 'str',
        'portfolio_weights': 'list[float]',
        'aggregation_account_id': 'str',
        'market_data_source': 'str'
    }

    attribute_map = {
        'events': 'events',
        'use_proxy_data': 'use_proxy_data',
        'portfolio_tickers': 'portfolio_tickers',
        'model_id': 'model_id',
        'allocation_id': 'allocation_id',
        'account_id': 'account_id',
        'portfolio_id': 'portfolio_id',
        'portfolio_weights': 'portfolio_weights',
        'aggregation_account_id': 'aggregation_account_id',
        'market_data_source': 'market_data_source'
    }

    def __init__(self, events=None, use_proxy_data=False, portfolio_tickers=None, model_id=None, allocation_id=None, account_id=None, portfolio_id=None, portfolio_weights=None, aggregation_account_id=None, market_data_source='nucleus'):  # noqa: E501
        """EventStudyRequest - a model defined in Swagger"""  # noqa: E501

        self._events = None
        self._use_proxy_data = None
        self._portfolio_tickers = None
        self._model_id = None
        self._allocation_id = None
        self._account_id = None
        self._portfolio_id = None
        self._portfolio_weights = None
        self._aggregation_account_id = None
        self._market_data_source = None
        self.discriminator = None

        if events is not None:
            self.events = events
        if use_proxy_data is not None:
            self.use_proxy_data = use_proxy_data
        if portfolio_tickers is not None:
            self.portfolio_tickers = portfolio_tickers
        if model_id is not None:
            self.model_id = model_id
        if allocation_id is not None:
            self.allocation_id = allocation_id
        if account_id is not None:
            self.account_id = account_id
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if portfolio_weights is not None:
            self.portfolio_weights = portfolio_weights
        if aggregation_account_id is not None:
            self.aggregation_account_id = aggregation_account_id
        if market_data_source is not None:
            self.market_data_source = market_data_source

    @property
    def events(self):
        """Gets the events of this EventStudyRequest.  # noqa: E501


        :return: The events of this EventStudyRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._events

    @events.setter
    def events(self, events):
        """Sets the events of this EventStudyRequest.


        :param events: The events of this EventStudyRequest.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["dot_com_bubble", "2008_financial_crisis", "brexit", "2011_black_monday", "september_eleventh", "1987_black_monday", "1992_black_wednesday", "1997_asian_financial_crisis"]  # noqa: E501
        if not set((event_value.lower() for event_value in events)) \
                .issubset(set((value.lower() for value in allowed_values))):
            raise ValueError(
                "Invalid values for `events` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(events) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._events = events

    @property
    def use_proxy_data(self):
        """Gets the use_proxy_data of this EventStudyRequest.  # noqa: E501


        :return: The use_proxy_data of this EventStudyRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_proxy_data

    @use_proxy_data.setter
    def use_proxy_data(self, use_proxy_data):
        """Sets the use_proxy_data of this EventStudyRequest.


        :param use_proxy_data: The use_proxy_data of this EventStudyRequest.  # noqa: E501
        :type: bool
        """

        self._use_proxy_data = use_proxy_data

    @property
    def portfolio_tickers(self):
        """Gets the portfolio_tickers of this EventStudyRequest.  # noqa: E501


        :return: The portfolio_tickers of this EventStudyRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._portfolio_tickers

    @portfolio_tickers.setter
    def portfolio_tickers(self, portfolio_tickers):
        """Sets the portfolio_tickers of this EventStudyRequest.


        :param portfolio_tickers: The portfolio_tickers of this EventStudyRequest.  # noqa: E501
        :type: list[str]
        """

        self._portfolio_tickers = portfolio_tickers

    @property
    def model_id(self):
        """Gets the model_id of this EventStudyRequest.  # noqa: E501


        :return: The model_id of this EventStudyRequest.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this EventStudyRequest.


        :param model_id: The model_id of this EventStudyRequest.  # noqa: E501
        :type: str
        """

        self._model_id = model_id

    @property
    def allocation_id(self):
        """Gets the allocation_id of this EventStudyRequest.  # noqa: E501


        :return: The allocation_id of this EventStudyRequest.  # noqa: E501
        :rtype: str
        """
        return self._allocation_id

    @allocation_id.setter
    def allocation_id(self, allocation_id):
        """Sets the allocation_id of this EventStudyRequest.


        :param allocation_id: The allocation_id of this EventStudyRequest.  # noqa: E501
        :type: str
        """

        self._allocation_id = allocation_id

    @property
    def account_id(self):
        """Gets the account_id of this EventStudyRequest.  # noqa: E501


        :return: The account_id of this EventStudyRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this EventStudyRequest.


        :param account_id: The account_id of this EventStudyRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this EventStudyRequest.  # noqa: E501


        :return: The portfolio_id of this EventStudyRequest.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this EventStudyRequest.


        :param portfolio_id: The portfolio_id of this EventStudyRequest.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def portfolio_weights(self):
        """Gets the portfolio_weights of this EventStudyRequest.  # noqa: E501


        :return: The portfolio_weights of this EventStudyRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._portfolio_weights

    @portfolio_weights.setter
    def portfolio_weights(self, portfolio_weights):
        """Sets the portfolio_weights of this EventStudyRequest.


        :param portfolio_weights: The portfolio_weights of this EventStudyRequest.  # noqa: E501
        :type: list[float]
        """

        self._portfolio_weights = portfolio_weights

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this EventStudyRequest.  # noqa: E501


        :return: The aggregation_account_id of this EventStudyRequest.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this EventStudyRequest.


        :param aggregation_account_id: The aggregation_account_id of this EventStudyRequest.  # noqa: E501
        :type: str
        """

        self._aggregation_account_id = aggregation_account_id

    @property
    def market_data_source(self):
        """Gets the market_data_source of this EventStudyRequest.  # noqa: E501


        :return: The market_data_source of this EventStudyRequest.  # noqa: E501
        :rtype: str
        """
        return self._market_data_source

    @market_data_source.setter
    def market_data_source(self, market_data_source):
        """Sets the market_data_source of this EventStudyRequest.


        :param market_data_source: The market_data_source of this EventStudyRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["nucleus", "integration"]  # noqa: E501
        if market_data_source is not None and market_data_source.lower() not in allowed_values:
            raise ValueError(
                "Invalid value for `market_data_source` ({0}), must be one of {1}"  # noqa: E501
                .format(market_data_source, allowed_values)
            )

        self._market_data_source = market_data_source

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
        if issubclass(EventStudyRequest, dict):
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
        if not isinstance(other, EventStudyRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
